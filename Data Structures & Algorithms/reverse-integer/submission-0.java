class Solution {
    public int reverse(int x) {
        int n = Math.abs(x);
        int rev = 0;
        while(n != 0) {
            if(rev > (Integer.MAX_VALUE - (n%10)) / 10) { //Here overflow will be check
                return 0;
            }
            rev = rev * 10 + (n%10);
            n/=10;
        }
        return (x < 0) ? (-rev) : rev;
    }
}
