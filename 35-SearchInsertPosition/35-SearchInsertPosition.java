// Last updated: 2/10/2026, 8:41:35 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
         //loop searching the number if you get the number return the index, if you get the number greater than it return index
        int p=0;
        for (int i =0; i< nums.length;i++){
            
            if (target<=nums[i]){
                p=i;
                //System.out.println(p);
                break;
            }
            else{
                p=i+1;
            }

    }
    return p;

}
}

