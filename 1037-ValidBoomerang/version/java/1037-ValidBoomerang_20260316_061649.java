// Last updated: 3/16/2026, 6:16:49 AM
// look at note very bad first attempt, think of simple as well as complex test scenarios
1class Solution {
2    public boolean isBoomerang(int[][] p) {
3        return (p[0][0] - p[2][0]) * (p[0][1] - p[1][1]) != (p[0][0] - p[1][0]) * (p[0][1] - p[2][1]);
4    }
5}
6
7//calculate slope