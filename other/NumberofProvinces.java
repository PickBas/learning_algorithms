// Link: https://leetcode.com/problems/number-of-provinces/description/
class Solution {
    boolean[] seen;

    public void dfs(int node, int[][] isConnected) {
        for (int i = 0; i < isConnected.length; ++i) {
            if (isConnected[node][i] == 1 && !seen[i]) {
                seen[i] = true;
                dfs(i, isConnected);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        seen = new boolean[isConnected.length];
        int ans = 0;
        for (int i = 0; i < isConnected.length; ++i) {
            if (!seen[i]) {
                ++ans;
                dfs(i, isConnected);
            }
        }
        return ans;
    }
}
// Beats: 99.98% in Runtime, 20.24% in Memory
