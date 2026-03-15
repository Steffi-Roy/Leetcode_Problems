// Last updated: 3/15/2026, 2:08:39 AM
// Damn the debigging took a while the bubble sort had an issue with j's intitalisation. This is very bad complexity implemnetation. COme back to this problem and get effective solution
1/*
2 * @lc app=leetcode id=169 lang=java
3 *
4 * [169] Majority Element
5 */
6
7// @lc code=start
8class Solution {
9    public int majorityElement(int[] nums) {
10        //calculate the number of times a number appear; 
11    //appear more than n/2 times
12        //sorted array, count how many times a number is repeated if the count is higher update
13
14        int high_count =0;
15        int count =0;
16        int ans =0;
17        int temp =0;
18
19
20        //sort array
21        for (int i =0; i<nums.length; i++){
22            for (int j =i+1 ; j< nums.length; j++){
23                if (nums[i]>nums[j]){
24                    temp = nums[i];
25                    nums[i]=nums[j];
26                    nums[j] = temp;
27                }
28            }
29
30        }
31
32        int l=0;
33        int half_length = (nums.length)/2;
34        if (half_length == 0){
35            ans = nums[l];
36        }
37
38        while(high_count != half_length){
39            if (nums[l]==nums[l+1]){
40                count++;
41            }
42            if (count> high_count){
43                high_count = count;
44                ans=nums[l];
45            }
46            l++;
47        }
48
49        return ans;
50
51    }
52}
53// @lc code=end
54
55