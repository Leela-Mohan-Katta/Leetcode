public class ReverseInteger {
    public static void main(String[] args) {
        int num=123;
        int res=reverse(num);
        System.out.println(res);


    }
    public static int reverse(int x) {
        boolean isNegative = x < 0;
        x = Math.abs(x);
        int result = 0;
        int max_diff = Integer.MAX_VALUE / 10;
        //MAX_VALUE / 10 = ( 214748364 ). If it is greater, the reverse integer does not exist.
        while(x > 0) {
            if(result > max_diff) return 0;
            result = 10*result + x % 10;
            x /= 10;
        }
        return isNegative ? -result : result;
    }
}
