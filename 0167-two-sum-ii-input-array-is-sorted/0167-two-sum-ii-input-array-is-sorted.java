class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> seen = new HashMap<>(); 
         
        
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i+1};
            }
            
            seen.put(numbers[i], i+1);
        }
        
        return new int[]{}; 
        
    }    
    
}