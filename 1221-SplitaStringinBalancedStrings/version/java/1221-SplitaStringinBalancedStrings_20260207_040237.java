// Last updated: 2/7/2026, 4:02:37 AM
// simple approach, learnt string to char using string.charAt(i)
1class Solution {
2    public int balancedStringSplit(String s) {
3        Map<String, Integer> dict = new HashMap<>();
4        int count_R =0;
5        int count_L =0;
6        int output =0;
7
8        for (int i=0; i<s.length(); i++){
9            char c= s.charAt(i);
10            if (c=='R'){
11                count_R++;
12            }
13            else if (c=='L'){
14                count_L++;
15            }
16            if(count_R==count_L){
17                output++;
18            }
19
20        }
21        return output;
22    }
23}
24
25class Eff_Solution {
26    public int balancedStringSplit(String s) {
27        int balance=0;
28        int output =0;
29
30        for (int i=0; i<s.length(); i++){
31            char c= s.charAt(i);
32            if (c=='R'){
33                balance++;
34            } else{
35                balance--;
36            }
37            if(balance == 0){
38                output++;
39            }
40
41        }
42        return output;
43    }
44}