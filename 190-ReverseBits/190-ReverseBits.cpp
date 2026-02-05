// Last updated: 2/5/2026, 2:41:02 AM
class Solution {
public:
    int reverseBits(int n) {
        int i=0;
        int result =0;
        int c=0;
        while(i<32){
            //c =(n&1);
            //cout<<"result = "<<c;
            result = (n&1) | (result <<1);
            //cout<<result;
            n= n>>1;
            i=i+1;


        }
        return result;
    }
};