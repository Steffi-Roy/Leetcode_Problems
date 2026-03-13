// Last updated: 3/13/2026, 1:30:24 AM
class Solution {
    public int[] plusOne(int[] digits) {

        int[] newDigits = new int[digits.length + 1];
        int last_element = digits[digits.length - 1];

        int carry = 1;
        int i = digits.length - 1;

        while (i >= 0) {

            if (digits[i] == 9 && carry == 1) {
                newDigits[i + 1] = 0;
                carry = 1;
            }
            else {
                newDigits[i + 1] = digits[i] + carry;
                carry = 0;
            }

            i--;
        }

        if (carry == 1) {
            newDigits[0] = 1;
            return newDigits;
        }

        for (int j = 0; j < digits.length; j++) {
            digits[j] = newDigits[j + 1];
        }

        return digits;
    }
}