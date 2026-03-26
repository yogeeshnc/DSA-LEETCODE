class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int[] ans = new int[nums.length];
        int j = 0;
        ;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                ans[j] = count;
                j++;
                count = 0;
                continue;

            }
            ans[j] = count;
        }
        int largest = ans[0];
        for (int i = 1; i < ans.length; i++) {
            if (ans[i] > largest) {
                largest = ans[i];
            }
        }

        return largest;

    }
}