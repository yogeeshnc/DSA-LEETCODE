class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long total  = 0;
        long curr = 0;
        for(int num : nums){
            if(num == 0){
                curr++;
                
            }else{
                total += (curr * (curr + 1)) / 2;
                curr = 0;
            }
        }
        if(curr > 0){
            total += (curr * (curr + 1)) / 2;
        }
        return total;
    }
}