// Last updated: 3/10/2026, 5:02:29 AM
// I started with substituting, didnt consider multiple 9s would carry it over
1class Solution {
2    public int[] plusOne(int[] digits) {
3
4        int[] newDigits = new int[digits.length + 1];
5        int last_element = digits[digits.length - 1];
6
7        int carry = 1;
8        int i = digits.length - 1;
9
10        while (i >= 0) {
11
12            if (digits[i] == 9 && carry == 1) {
13                newDigits[i + 1] = 0;
14                carry = 1;
15            }
16            else {
17                newDigits[i + 1] = digits[i] + carry;
18                carry = 0;
19            }
20
21            i--;
22        }
23
24        if (carry == 1) {
25            newDigits[0] = 1;
26            return newDigits;
27        }
28
29        for (int j = 0; j < digits.length; j++) {
30            digits[j] = newDigits[j + 1];
31        }
32
33        return digits;
34    }
35}