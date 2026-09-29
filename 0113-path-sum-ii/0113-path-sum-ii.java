class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, targetSum, path, ans);
        return ans;
    }
    private void dfs(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> ans) {
        if (root == null) return;

        
        path.add(root.val);

        
        if (root.left == null && root.right == null) {
            if (root.val == targetSum) {
               
                ans.add(new ArrayList<>(path)); 
            }
        } else {
           
            int bal = targetSum - root.val;
            dfs(root.left, bal, path, ans);
            dfs(root.right, bal, path, ans);
        }

        
        path.remove(path.size() - 1);
    }
}