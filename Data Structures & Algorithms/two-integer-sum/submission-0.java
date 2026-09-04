class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> xMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int needed = target - nums[i];
            
            if(xMap.containsKey(needed)){
                return new int[] {xMap.get(needed), i};
            }
            else{
                xMap.put(nums[i], i);
            }
        }
        return new int[] {0, 0};
    }
}
