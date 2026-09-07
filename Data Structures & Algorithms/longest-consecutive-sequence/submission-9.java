class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if(len == 0){
            return 0;
        }
        if(len == 1){
            return 1;
        }
        int i = 1;
        int sub = 0;
        int temp = nums[0];
        int[] counter = new int[len];
        for(int x = 0; x< len; x++){
            counter[x] = 0;
        }
        int j = 0;
        for (i = 1; i < len; i++){
            sub = nums[i] - nums[i - 1];
            if(sub > 1){

                j++;
            }
            else if(sub != 0){
                counter[j]++;
            }
            
        }

        Arrays.sort(counter);
        for(int x = len-1; x > -1; x--){
            if(counter[x] != 0){
                return counter[x] + 1;
            }
        }

    
        return 1;
    }
}
