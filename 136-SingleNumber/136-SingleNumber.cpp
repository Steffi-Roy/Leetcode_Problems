// Last updated: 2/5/2026, 2:41:04 AM
class Solution {
public:
    int singleNumber(vector<int>& nums) {
        //have a for loop find arr[i] equal match, if there is equal match remove from stored array


        // xor of each element with element in array

        // no xor of elementnwith each other will give 0, so xor al elements then the one that is unique will remain
        int ans=0;

        for (int i=0; i<nums.size(); i++){
            ans=ans^nums[i];

        }

    return ans;   
    }
    
};