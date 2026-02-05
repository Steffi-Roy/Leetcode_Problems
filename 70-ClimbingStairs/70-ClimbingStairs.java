// Last updated: 2/5/2026, 3:11:17 AM
class Solution {
    public int climbStairs(int n) {
        // n stairs , step of 1s, step of 2s. 2 - {1,1}, 3 - {2,1},{1,2}, 
        //compound the sum of steps 
        //1,1,1,1 
        //2,1,1
        //1,2,1
        //1,1,2
        if (n<=2) return n;
        int a=1; int b=2;
        for(int i=3;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;

    }
}