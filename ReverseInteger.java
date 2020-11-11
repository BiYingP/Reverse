package Reverse;

public class ReverseInteger {

    public int reverseInteger(int n){
        long result = 0;
        while(n != 0){
            result = result * 10 + n % 10;
            n = n / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }
        return (int) result;
    }

    public static void main (String[] args){
        ReverseInteger r = new ReverseInteger();
        int n = 12345;
        System.out.println(r.reverseInteger(n));

    }
}
