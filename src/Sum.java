import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sum {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int[] twoSum(int[] nums, int target) {
        int[] ind = {0,0};
        int l = nums.length;
        for (int i=0;i<l;i++){
            for (int j=0;j<l;j++){
                if(nums[i]+nums[j]== target && i!=j){
                    ind[0] = i;
                    ind[1] = j;
                    return ind;
                }
            }
        }
        return ind;

    }

    public int subarraySum(int[] nums, int k) {

        int l = nums.length;
        int count = 0;
        for (int i=0;i<l-1;i++){
            int add = nums[i];
            if (add == k)count++;
            for (int j=i+1;j<l;j++){
                add+=nums[j];
                if (add == k)count++;
            }
        }
        if (nums[l-1]==k)count++;
        return count;

    }

    public List<Integer> lexicalOrder(int n) {
        List<Integer> list_i = new ArrayList<Integer>();
        //list_i.add(1);
        int len = Integer.toString(n).length();

        String[] model = {"0","1","2","3","4","5","6","7","8","9"};

        for (int i=1;i<=n;i++){
            list_i.add(i);
        }

        return list_i;

    }

    public void Alvaro_Muy_Bien(String s){
        System.out.print(s+"Alvaro");
    }

}
