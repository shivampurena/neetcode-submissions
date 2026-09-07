class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] out = new int[len];
        int product = 1;
        int zeroCounter = 0;
        for (int i = 0; i < len; i++){
            if(nums[i] == 0){
                zeroCounter++;
            }
            else{
                product = nums[i]*product;
            }

            out[i] = 0;
            
        }

        if(zeroCounter > 1){
            return out;
        }


        for(int i = 0; i < len; i++){
            
            if(nums[i] == 0){
                out[i] = product;
            }
            
            
            if(zeroCounter == 0){
                out[i] = product/nums[i];
            }
            
        }
        return out;
    }
}  
