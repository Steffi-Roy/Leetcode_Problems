// Last updated: 2/17/2026, 10:07:00 PM
/*
 * string.indexOf(c) will return the value of index where c matches if not it will return -1
 * 
 * Used flags and condition statments, && for logical/boolean statments, & does binary math.
 * 
 * Time complexity is O(n)
*/

1class Solution {
2    public boolean strongPasswordCheckerII(String password) {
3        char[] arr = password.toCharArray();
4        int flag=0;
5        Character temp = '\0';
6        int lower_case_flag=0;
7        int upper_case_flag=0;
8        int digit_flag=0;
9        int special_character =0;
10        if (password.length()<8){
11            return false;
12        }
13        for (char c : arr) {
14            if(lower_case_flag ==0 && Character.isLowerCase(c)){
15                lower_case_flag ++;
16            }
17            if (upper_case_flag==0 && Character.isUpperCase(c)){
18                upper_case_flag ++;
19            }
20            if (digit_flag ==0 && Character.isDigit(c)){
21                digit_flag++;
22            }
23            //if (c contains a special character){
24              //  special_character++;
25            
26            if ("!@#$%^&*()-+".indexOf(c) >= 0 && special_character==0) {
27                special_character++;
28            }
29
30            if (temp == c){   
31                return false;
32            }
33            temp = c;
34        }
35
36            System.out.printf("lower=%d upper=%d digit=%d%n",
37        lower_case_flag, upper_case_flag, digit_flag);
38
39        
40
41        if ((lower_case_flag ==1 && upper_case_flag ==1 && digit_flag==1 && special_character==1)){
42            return true;
43        }
44
45    return false;
46    }
47
48}