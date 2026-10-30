class Solution {
    public boolean isHappy(int n) {
        int t = n;
        while(t != 1 && t != 4) {
            int sum = 0;
            while(t != 0) {
                int r = t % 10;
                sum += r*r;
                t/=10;
            }
            t = sum;
        }
        if(t == 1) {
            return true;
        } else {
            return false;
        }
    }
}
