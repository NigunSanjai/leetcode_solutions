class Solution {
    public int reverse(int x) {
        long result = 0;
        int copy = x < 0 ? -x : x;
        while(x!=0) {
            int temp = x%10;
            result = (result *10)+ temp;
            x = x/10;
        }
        return (result > Integer.MIN_VALUE && result < Integer.MAX_VALUE) ? (int) result : 0;

    }
}