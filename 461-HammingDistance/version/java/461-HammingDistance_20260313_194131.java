// Last updated: 3/13/2026, 7:41:31 PM
// Using Integer.bitCount()
1class Solution {
2    public int hammingDistance(int x, int y) {
3        //xor the two numbers bitwise
4        //count the ones in the xor answer
5        //12= 1100 mod10
6        //7= 111 
7
8        int out = x^y;
9
10        return Integer.bitCount(out);
11    }
12
13    
14}