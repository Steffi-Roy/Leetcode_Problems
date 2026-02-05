// Last updated: 2/5/2026, 2:41:00 AM
class Solution {
public:
    vector<int> countBits(int n) {

        // THAT IS SIMILAR TO HAMMING WEIGHT    problem 190 leet code, if n&1==1, ans=ans +1, n>>1
       vector<int> ans(n + 1, 0);
        //ans[0] = 0;
        
        for (int i=0; i<n+1; i++){
            int j=0;
            int x=i;
            while(x!=0){
            if ((x&1 )==1){
                j = j+1;
            
            }
            
            x=x>>1;
        }
        ans[i]=j;
        
    }
    return ans;}
};