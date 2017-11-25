import java.util.ArrayList;

public class Combine {

    public void getStrings(int [] ins){

        ArrayList outputs_pre = new ArrayList<String>();
        ArrayList outputs_new = new ArrayList<String>();
        int leng = ins.length;

        String temp_str="";
        outputs_pre.add(temp_str);

        for(int i=0;i<leng;i++){
            char [] cs = getCharArray(ins[i]);
            for (Object ss : outputs_pre){
                temp_str = (String)ss;
                for(char c : cs){
                    outputs_new.add(temp_str+c);
                }
            }
            outputs_pre.clear();
            outputs_pre = (ArrayList<String>) outputs_new.clone();
            outputs_new.clear();
        }
        for (Object ss : outputs_pre){
            System.out.println((String)ss);
        }
    }

    public char[] getCharArray(int i){

        char [] num2 = {'a','b','c'};
        char [] num3 = {'d','e','f'};
        char [] num4 = {'g','h','i'};
        char [] num5 = {'j','k','l'};
        char [] num6 = {'m','n','o'};
        char [] num7 = {'p','q','r','s'};
        char [] num8 = {'t','u','v'};
        char [] num9 = {'w','x','y','z'};
        char [] def = {};

        switch (i){
            case 2:
                return num2;
            case 3:
                return num3;
            case 4:
                return num4;
            case 5:
                return num5;
            case 6:
                return num6;
            case 7:
                return num7;
            case 8:
                return num8;
            case 9:
                return num9;
            default:
                return def;
        }
    }
}
