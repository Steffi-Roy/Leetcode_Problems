// Last updated: 2/10/2026, 8:41:36 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String s = strs[0];
        //System.out.println(strs.length - 1);
        String save = "";
        if (strs.length ==1){
            return s;
        }

        for (int i = 0; i < strs.length - 1; i++) {
            String temp = "";

            for (int j = 0; j < s.length() && j < strs[i + 1].length(); j++) {
                if (s.charAt(j) == strs[i + 1].charAt(j)) {
                    System.out.println(s.charAt(j));
                    temp += s.charAt(j);
                } else {
                    break;
                }
            }

            save = temp;
            s = save;

            if (s.length() == 0) break;
        }

        return save;
    }
}
