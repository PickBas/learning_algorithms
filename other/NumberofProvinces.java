// Link: https://leetcode.com/problems/number-of-provinces/description/
class Solution {
    boolean[] seen;
    int[][] gr;

    public void dfs(int node) {
        for (int i = 0; i < gr.length; ++i) {
            if (gr[node][i] == 1 && !seen[i]) {
                seen[i] = true;
                dfs(i);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        gr = isConnected;
        seen = new boolean[isConnected.length];
        int ans = 0;
        for (int i = 0; i < isConnected.length; ++i) {
            if (!seen[i]) {
                ++ans;
                dfs(i);
            }
        }
        return ans;
    }
}
// Beats: 99.98% in Runtime, 5.12% in Memory
