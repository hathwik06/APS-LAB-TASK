class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int total, leftsum, i, ls, rs;
        int n = nums.length;
        int[] ans = new int[n]; 
        leftsum = 0;
        total = 0;
        for (i = 0; i < n; i++) {
            total = total + nums[i];
        }
        for (i = 0; i < n; i++) {
            ls = i * nums[i] - leftsum; 
            rs = (total - leftsum - nums[i]) - (n - i - 1) * nums[i]; 
            leftsum = leftsum + nums[i];
            ans[i] = ls + rs;
        }
        return ans;
    }
}
