class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;// indicates the position next element to be insert into the array
        for(int j=1;j<nums.length;j++){ 
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return (i+1);
    }
}