class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int iBegin = 0, iEnd = 0;
        StringBuilder currentStr = new StringBuilder();
        String sv = "";
        while (iEnd != s.length()) {
            ++iEnd;
            currentStr.append(s.substring(iBegin, iEnd));
            int indexFoundOrNot = currentStr.toString().indexOf(s.charAt(iEnd - 1));
            if (indexFoundOrNot != currentStr.length() - 1) {
                if (sv.length() < iEnd - iBegin - 1) {
                    sv = s.substring(iBegin, iEnd - 1);
                }
                iBegin += indexFoundOrNot + 1;
            }
            currentStr.setLength(0);
        }
        return sv.length() <= iEnd - iBegin ? iEnd - iBegin : sv.length();
    }
}

// Beats 85% in run time and 84% in memory usage
