// Last updated: 2/10/2026, 8:41:37 PM
class Solution {
    public boolean isPalindrome(int x) {
        int reversed =0;
        int digit =0;
        int n = x;
        if (n<0){
            return false;
        }
        while(n>0){
            digit=n%10; //121
            reversed = reversed * 10 + digit; //121
            n=n/10;
            //System.out.println(reversed);
        }
        
       return(x==reversed);
    }
}