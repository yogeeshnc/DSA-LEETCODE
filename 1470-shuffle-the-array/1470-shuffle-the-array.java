class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        ans[0]=nums[0];
        ans[2*n-1]=nums[2*n-1];
        for (int i=1;i<n;i++){
            ans[2*i]=nums[i];
            ans[(2*i)-1]=nums[(n+i)-1];
            }
        return ans;
    }
}