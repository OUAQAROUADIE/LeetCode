class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.isEmpty()){
            return -1;
        }
        return haystack.indexOf(needle);
    }
}