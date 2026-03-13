// Last updated: 3/13/2026, 1:30:20 AM
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        //Group such that each group has 4 character first one can have any atleast one
        // start from end _ _ _ _ - _ _ _ _ - _ _ _ _ - _ _
        //have to remove dashes from the beginning, ascii?
        //char[] arr = s.toCharArray();
        //create dynamic char array c 
        StringBuilder sb = new StringBuilder();
        StringBuilder out = new StringBuilder();
        int count =0;
        for (int i = 0; i<s.length(); i++){
            
            if (s.charAt(i) != '-'){
                sb.append(s.charAt(i));
                
            }
        }
        sb.reverse(); //dcba
        for (int j=0; j<sb.length();j++){
            if (count == k){
                out.append("-");
                count=0;
            }
            out.append(sb.charAt(j));
            count++;

        }
        out.reverse();



        return out.toString().toUpperCase(); //return sb.toString();
    }
}