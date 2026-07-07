class Solution {
    public int reverse(int x) {
        int num = x;
        long reverse = 0;
        int remainder = 0;
        while(num != 0) {
            remainder = num % 10;
            reverse = (reverse * 10 ) + remainder;
            num = num / 10;
        }
        if(reverse >= Integer.MIN_VALUE && reverse <= Integer.MAX_VALUE) return (int)reverse;
        else return 0;
    }

}