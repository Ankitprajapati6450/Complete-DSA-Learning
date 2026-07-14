class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int num = x;
        long reverse = 0;
        int remainder = 0;
        while(num != 0){
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        if(x == reverse){
            return true;
        }
        return false;
        }
}