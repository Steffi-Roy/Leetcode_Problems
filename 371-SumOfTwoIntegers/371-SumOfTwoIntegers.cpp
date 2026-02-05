// Last updated: 2/5/2026, 2:40:59 AM
class Solution {
public:
    int getSum(int a, int b) {
        int sum=0;
        int carry=0;
        while (b!=0){
            sum = a&b;
            a = a^b;
            b= sum <<1;
        }
        carry= a^b;
        cout<< "sum"<<sum<<"carry = "<< carry;

        return carry;
    }
    
};