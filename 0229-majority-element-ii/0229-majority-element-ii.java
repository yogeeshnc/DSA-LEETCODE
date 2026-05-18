class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result= new ArrayList<>();
        //If an element appears more than n/3 times, there can be at most 2 such elements.
        int count1=0;
        int count2=0;
        Integer candidate1 =null,candidate2=null;

        for (int num : nums) {
            if (candidate1 != null && num == candidate1) {
                count1++;
            } else if (candidate2 != null && num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
          count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }
       if (count1 > nums.length / 3) result.add(candidate1);
        if (count2 > nums.length / 3) result.add(candidate2);

        return result;

    }
}