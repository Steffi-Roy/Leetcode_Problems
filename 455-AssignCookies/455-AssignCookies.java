// Last updated: 3/13/2026, 1:30:19 AM
/*
 * @lc app=leetcode id=455 lang=java
 *
 * [455] Assign Cookies
 */

// @lc code=start
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //lets assume they are sorted array
        int count=0;
        int k=0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i=0; i<g.length;i++){
            for (int j=0; j<s.length;j++){
                
                if (s[j]>=g[i]){
                    System.out.printf("g[i]= %d, s[j] = %d\n", g[i], s[j]);
                    //k=j;
                    //s[j]=s[j+1];
                    //s[s.length-1-]==
                    //slide the array or remove element from array
                    s[j]=-1000000;
                    g[i]=100000000;
                    count = count +1;
                    break;
                }
                else{
                    continue;
                }
  


            }
        }
        return count;
    }
}
// @lc code=end

