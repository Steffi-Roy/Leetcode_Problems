// Last updated: 3/13/2026, 1:31:19 AM
// Using stringbuilder class is efficient
1/*
2 * @lc app=leetcode id=482 lang=java
3 *
4 * [482] License Key Formatting
5 */
6
7// @lc code=start
8class Solution {
9    public String licenseKeyFormatting(String s, int k) {
10        //Group such that each group has 4 character first one can have any atleast one
11        // start from end _ _ _ _ - _ _ _ _ - _ _ _ _ - _ _
12        //have to remove dashes from the beginning, ascii?
13        //char[] arr = s.toCharArray();
14        //create dynamic char array c 
15        StringBuilder sb = new StringBuilder();
16        StringBuilder out = new StringBuilder();
17        int count =0;
18        for (int i = 0; i<s.length(); i++){
19            
20            if (s.charAt(i) != '-'){
21                sb.append(s.charAt(i));
22                
23            }
24        }
25        sb.reverse(); //dcba
26        for (int j=0; j<sb.length();j++){
27            if (count == k){
28                out.append("-");
29                count=0;
30            }
31            out.append(sb.charAt(j));
32            count++;
33
34        }
35        out.reverse();
36
37
38
39        return out.toString().toUpperCase(); //return sb.toString();
40    }
41}
42// @lc code=end
43
44