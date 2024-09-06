public class reverseInteger {
    public int reverse(int x) {
        int result = 0;

        while(x!=0){
            int digit = x % 10;

            if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE/10 && digit>7)){
                return 0;
            }
            if(result<Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE/10 && digit<-8)){
                return 0;
            }
            result = result*10+digit;
            x/=10;
        }
        return result;
        
    }
    public static void main(String[] args){
        Solution solution = new Solution();

        System.out.println(solution.reverse(123));
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(120));
    }
}
