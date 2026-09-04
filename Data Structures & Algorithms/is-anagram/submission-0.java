class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chr1 = s.toCharArray();
        char[] chr2 = t.toCharArray();

        Arrays.sort(chr1);
        Arrays.sort(chr2);
        if(Arrays.equals(chr1, chr2)){
            return true;
        }
        return false;
    }
}
