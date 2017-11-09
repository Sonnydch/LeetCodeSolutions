

public class IsValid {

    public boolean match(char c1, char c2){
        switch (c1){
            case '{':
                return c2 == '}';
            case '[':
                return c2 ==']';
            case '(':
                return c2 == ')';
        }

     return false;
    }

    public boolean isValid(String s){


        boolean val = false;
        char[] cs = s.toCharArray();

        if(s.length()%2!=0){
            return false;
        }

        boolean changed=true;
        String ps;
        while (changed){

            ps = s;

            cs = pair(s);
            s = String.copyValueOf(cs);
            cs = subStr(s);
            s = String.copyValueOf(cs);
            if (s.length() == 0){
                return true;
            }
            if (ps.equalsIgnoreCase(s)){
                changed = false;
            }

        }
        return val;
    }

    public char[] pair(String s){

        char [] cs = s.toCharArray();

        for (int i=0;i<cs.length-1;i++){
            if (match(cs[i],cs[i+1])){
                cs[i] = ' ';
                cs[i+1] = ' ';
            }
        }

        return cs;
    }

    public char[] subStr(String s){
        s = s.replaceAll("\\s","");
        return s.toCharArray();
    }
/*
    public boolean isValid(String s) {

        boolean val = true;

        Map m = new HashMap<Character,Character>();

        m.put('(',')');
        m.put('{','}');
        m.put('[',']');

        if (s.length()%2!=0){
            return false;
        }
        for (int i=0;i< s.length()-1;i+=2){
            char f = s.charAt(i);
            if (f==')'||f=='}'||f==']'){
                val = false;
                break;
            }
            char sc = s.charAt(i+1);
            if (sc!=(char) m.get(f)){
                val = false;
                break;
            }
        }

        return val;
    }*/


}




