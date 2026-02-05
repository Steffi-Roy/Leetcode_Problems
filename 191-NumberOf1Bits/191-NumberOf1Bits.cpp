// Last updated: 2/5/2026, 2:41:01 AM
class Solution {
public:
    int hammingWeight(int n) {
        uint c=0;
        while (n!=0){
            if (n&1==1){
                c++;
                
            }
            n=n>>1;
        }
      return c;  
    }
    //return c;
};