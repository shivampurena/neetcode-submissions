class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> xMap = new HashMap<>();
        List<String> lst = new ArrayList<>();
        Integer ind = 0;

        for(String str : strs){
            char[] chrs = str.toCharArray();
            Arrays.sort(chrs);
            String xkey = new String(chrs);
            xMap.computeIfAbsent(xkey, k -> new ArrayList<>()).add(str);
        
        }

        return new ArrayList<>(xMap.values());
        
    }
}
