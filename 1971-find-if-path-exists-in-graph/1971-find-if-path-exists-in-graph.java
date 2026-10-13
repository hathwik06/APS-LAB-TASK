class Solution {
    public boolean validPath(int n, int[][] edges, int s, int d) {
        List<Integer>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            g[u].add(v);
            g[v].add(u);
        }
       
        boolean[] v = new boolean[n];
        return dfs(s, d, g, v);
    }

    private boolean dfs(int s, int d, List<Integer>[] g, boolean[] v) {
        if (s == d) return true;
        v[s] = true;
        
        for (int next : g[s]) {
            if (!v[next]) {
                if (dfs(next, d, g, v)) {
                    return true;
                }
            }
        }
        return false;
    }
}
