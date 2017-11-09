public class LongestCP {

    public String longestCommonPrefix(String[] strs) {
        String pivot = "";
        String pivot_t ="";
        if (strs.length == 0 || strs[0].length() ==0){
            return "";
        }

        int count=0;
        Character c = strs[0].charAt(count);
        pivot_t+=c;
        boolean round_check;
        while (count<strs[0].length()){
            round_check = true;
            for (int i=0;i<strs.length;i++){

                if (strs[i].length()<count+1){
                    round_check = false;
                    break;
                }
                if (strs[i].charAt(count) != pivot_t.charAt(count)){
                    round_check = false;
                    break;
                }
            }
            count++;
            if (round_check ){
                pivot = pivot_t;
                if (count<strs[0].length()) pivot_t += strs[0].charAt(count);
            }else {
                break;
            }
        }

        return pivot;
    }
}
