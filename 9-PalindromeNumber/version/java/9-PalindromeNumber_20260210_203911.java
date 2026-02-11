// Last updated: 2/10/2026, 8:39:11 PM
// It wasnt implemented well. Come back to this question
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        if (strs == null || strs.length == 0) return "";
4
5        String s = strs[0];
6        System.out.println(strs.length - 1);
7        String save = "";
8        if (strs.length ==1){
9            return s;
10        }
11
12        for (int i = 0; i < strs.length - 1; i++) {
13            String temp = "";
14
15            for (int j = 0; j < s.length() && j < strs[i + 1].length(); j++) {
16                if (s.charAt(j) == strs[i + 1].charAt(j)) {
17                    System.out.println(s.charAt(j));
18                    temp += s.charAt(j);
19                } else {
20                    break;
21                }
22            }
23
24            save = temp;
25            s = save;
26
27            if (s.length() == 0) break;
28        }
29
30        return save;
31    }
32}
33