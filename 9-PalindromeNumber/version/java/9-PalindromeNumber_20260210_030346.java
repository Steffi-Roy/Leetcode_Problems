// Last updated: 2/10/2026, 3:03:46 AM
// Find the reversal fo number: Use %10 to get the digits then /10 to shorten the number
1class Solution {
2    public boolean isPalindrome(int x) {
3        int reversed =0;
4        int digit =0;
5        int n = x;
6        if (n<0){
7            return false;
8        }
9        while(n>0){
10            digit=n%10; //121
11            reversed = reversed * 10 + digit; //121
12            n=n/10;
13            //System.out.println(reversed);
14        }
15        
16       return(x==reversed);
17    }
18}