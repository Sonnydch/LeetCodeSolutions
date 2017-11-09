import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RomanToInt {


    public int romanToInt(String s) {

        Map m = new HashMap<Character, Integer>();

        m.put('I',1);
        m.put('V',5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M',1000);

       char[] cs = s.toCharArray();
       int sum=0;

       for (int i =0;i<s.length()-1;i++){
           if ((Integer)m.get(cs[i])<(Integer) m.get(cs[i+1])){
                sum-=(Integer)m.get(cs[i]);
           }else {
               sum +=(Integer)m.get(cs[i]);
           }
       }

       sum+=(Integer)m.get(cs[s.length()-1]);


    return sum;

    }


}
