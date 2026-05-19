class Solution {
    public int majorityElement(int[] nums) {
        int ct=0;
        int el=0;
        for(int i=0;i<nums.length;i++){
            if(ct==0){
                ct=1;
                el=nums[i];
            }
            else if(nums[i] == el){
                ct++;
            }
            else{
                ct--;
            }
        }
         return el;//moore's algorithm
    }
}