public class Palindrome {

    public boolean isPalindrome(int x) {

        if (x<0)
            return false;

        if (x>=0 && x<10)
            return true;

        String sx = Integer.toString(x);

        int length =  sx.length();
        int end = length/2;

        for (int i=0;i<end;i++){
            if (sx.charAt(i)!=sx.charAt(length-1-i))
                return false;
        }

        return true;

    }

    public static void main(String[] args) {
        Palindrome r = new Palindrome();
        System.out.println(r.isPalindrome(-2147483648));

    }

}
