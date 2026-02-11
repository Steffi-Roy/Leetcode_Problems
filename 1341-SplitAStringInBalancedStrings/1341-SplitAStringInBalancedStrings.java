// Last updated: 2/10/2026, 8:41:31 PM
class Solution {
    public int balancedStringSplit(String s) {
        Map<String, Integer> dict = new HashMap<>();
        int count_R =0;
        int count_L =0;
        int output =0;

        for (int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if (c=='R'){
                count_R++;
            }
            else if (c=='L'){
                count_L++;
            }
            if(count_R==count_L){
                output++;
            }

        }
        return output;
    }
}

class Eff_Solution {
    public int balancedStringSplit(String s) {
        int balance=0;
        int output =0;

        for (int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if (c=='R'){
                balance++;
            } else{
                balance--;
            }
            if(balance == 0){
                output++;
            }

        }
        return output;
    }
}