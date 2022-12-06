// Link: https://leetcode.com/problems/simplify-path/description/
class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] paths = path.split("/");
        for (String dir : paths) {
            if (dir.equals(".") || dir.isEmpty()) {
                continue;
            }
            if (dir.equals("..")) {
                if (!st.empty()) {
                    st.pop();   
                }
            } else {
                st.push(dir);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String dir : st) {
            result.append("/");
            result.append(dir);
        }
        return result.length() == 0 ? "/" : result.toString();
    }
}
// Beats: 79.21% in Runtime; 57.68% in Memory
