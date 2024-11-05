class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> l = new ArrayList<>();
        if (groups.length == 1) {
            return new ArrayList<>(List.of(words[0]));
        }
        int j =0;
        for(int i = 1 ; i < words.length ; i++){
            if(groups[i] != groups[j]){
                    l.add(words[j]);
                    j=i;
            }
            
        }
        l.add(words[j]);
        return l;
    }
}