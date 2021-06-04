class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int remainder = x;
        int reverse = 0;

        while (remainder > 0) {

            int lastDigit = remainder % 10;
            reverse *= 10;
            reverse += lastDigit;
            remainder /= 10;
        }
        return x == reverse;
    }
}
