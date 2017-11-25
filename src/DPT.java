public class DPT {

    public void Min(int m){
        //1,3,5
        int[] s = new int[m+1];
        for (int i=0;i<m+1;i++){
            s[i] = 2222222;
        }
        s[0] = 0;
        int[] cs = {1,3,5};
        for (int i=1;i<=m;i++){
            for (int j=0;j<cs.length;j++){
                if (cs[j]<=i
                        && s[i-cs[j]]+1<s[i]){
                    s[i] = s[i-cs[j]]+1;
                }
            }
        }
        System.out.println(s[m]);

    }
}
