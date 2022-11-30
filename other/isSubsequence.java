// Link: https://leetcode.com/problems/is-subsequence/description/
class Solution {
    public boolean isSubsequence(String s, String t) {
        short si = 0, ti = 0;
        while (si < s.length() && ti < t.length()) {
            if (s.charAt(si) == t.charAt(ti++)) {
                ++si;
            }
        }
        return si == s.length();
    }
}
// Beats: 93.6% in Runtime; 89.74% in Memory
