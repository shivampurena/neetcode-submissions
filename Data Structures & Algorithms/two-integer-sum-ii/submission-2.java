class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        Map<Integer, Integer> xmap = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){

            int needed = target - numbers[i];

            if(xmap.containsKey(needed)){
                int ind = xmap.get(needed);
                return new int[] {ind+1, i+1};
            }
            xmap.put(numbers[i], i);

        }

        return new int[] {0};
    }
}
