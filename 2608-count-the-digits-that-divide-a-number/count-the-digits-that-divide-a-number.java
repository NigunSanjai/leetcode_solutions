class Solution {
    public int countDigits(int num) {
        int copy = num;
        int result = 0;
        while (copy!=0) {
            int rem = copy%10;
            if(num%rem ==0) result ++;
            copy = copy/10;
        }
        return result;
    }
}