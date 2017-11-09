import java.util.ArrayList;

public class Reverse {

    public int reverse(int x) {

        boolean neg = false;
        if (x<0)neg=true;

        String t = x+"";
        int l = t.length();
        String r = "";
        int end = 0;
        if(neg)end=1;
        for(int i=l-1;i>=end;i--){

            if (r.length()==0 && t.charAt(i)=='0')continue;
            r+=t.charAt(i);
        }

        int result = 0;
        if (r.equals(""))return result;
        long ll = Long.parseLong(r);
        if (ll>2147483647){
            return 0;
        }
        result = Integer.parseInt(r);
        if (neg) result = 0-result;
        return result;



    }


    public static void main(String[] args) {
        Reverse r = new Reverse();
        System.out.println(r.reverse(-100));

    }



}
