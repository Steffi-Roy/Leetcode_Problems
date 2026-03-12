// Last updated: 3/12/2026, 4:28:34 AM
// dammn i knew i ight have to sort the array but that jumped flied from top of my head
1/*
2 * @lc app=leetcode id=455 lang=java
3 *
4 * [455] Assign Cookies
5 */
6
7// @lc code=start
8class Solution {
9    public int findContentChildren(int[] g, int[] s) {
10        //lets assume they are sorted array
11        int count=0;
12        int k=0;
13        Arrays.sort(g);
14        Arrays.sort(s);
15        for (int i=0; i<g.length;i++){
16            for (int j=0; j<s.length;j++){
17                
18                if (s[j]>=g[i]){
19                    System.out.printf("g[i]= %d, s[j] = %d\n", g[i], s[j]);
20                    //k=j;
21                    //s[j]=s[j+1];
22                    //s[s.length-1-]==
23                    //slide the array or remove element from array
24                    s[j]=-1000000;
25                    g[i]=100000000;
26                    count = count +1;
27                    break;
28                }
29                else{
30                    continue;
31                }
32  
33
34
35            }
36        }
37        return count;
38    }
39}
40// @lc code=end
41
42