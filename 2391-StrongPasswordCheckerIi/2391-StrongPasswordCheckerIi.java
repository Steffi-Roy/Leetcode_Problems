// Last updated: 2/17/2026, 10:07:44 PM
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        char[] arr = password.toCharArray();
        int flag=0;
        Character temp = '\0';
        int lower_case_flag=0;
        int upper_case_flag=0;
        int digit_flag=0;
        int special_character =0;
        if (password.length()<8){
            return false;
        }
        for (char c : arr) {
            if(lower_case_flag ==0 && Character.isLowerCase(c)){
                lower_case_flag ++;
            }
            if (upper_case_flag==0 && Character.isUpperCase(c)){
                upper_case_flag ++;
            }
            if (digit_flag ==0 && Character.isDigit(c)){
                digit_flag++;
            }
            //if (c contains a special character){
              //  special_character++;
            
            if ("!@#$%^&*()-+".indexOf(c) >= 0 && special_character==0) {
                special_character++;
            }

            if (temp == c){   
                return false;
            }
            temp = c;
        }

           // System.out.printf("lower=%d upper=%d digit=%d%n",lower_case_flag, upper_case_flag, digit_flag);

        

        if ((lower_case_flag ==1 && upper_case_flag ==1 && digit_flag==1 && special_character==1)){
            return true;
        }

    return false;
    }

}