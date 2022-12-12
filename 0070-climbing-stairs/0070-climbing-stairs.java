class Solution {
    public int climbStairs(int n) {
        if ( n < 3 ) return n;
        
        int one = 1;
        int two = 2;
        
        for (int i=3;i<=n;i++) {
            int temp = two;
            two += one;
            one = temp;
        }
        return two;
        
        
    }
}