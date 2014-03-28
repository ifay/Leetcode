/*
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * 
 * The digits are stored such that the most significant digit is at the head of the list.
 */
 public class PlusOne {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int carry = 0;
        for (int i=length-1; i>=0; i--) {
            int sum;
            if (i == length -1) {
                sum = carry + digits[i] + 1;
                digits[i] = sum%10;
            } else {
                sum = carry + digits[i];
                digits[i] = sum%10;
            }
            carry = (int)sum/10;
        }
        if (carry > 0 ) {
            int[] newDigits = new int[length +1];
            for (int j = length ; j>0 ; j--) {
                newDigits[j] = digits[j-1];
            }
            newDigits[0] = 1;
            return newDigits;
        } else {
            return digits;
        }
    }
}