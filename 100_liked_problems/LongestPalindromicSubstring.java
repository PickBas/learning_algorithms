class Solution {
    public String longestPalindrome(String s) {
        StringBuilder currentPal = new StringBuilder();
        int left, right;
        for (int i = 0; i < s.length(); ++i) {
            left = right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > currentPal.length()) {
                    currentPal.setLength(0);
                    currentPal.append(s.substring(left, right + 1));
                }
                --left; ++right;
            }
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > currentPal.length()) {
                    currentPal.setLength(0);
                    currentPal.append(s.substring(left, right + 1));
                }
                --left; ++right;
            }
        }
        return currentPal.toString();
    }
}
