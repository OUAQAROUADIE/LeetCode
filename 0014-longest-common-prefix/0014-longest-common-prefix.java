class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        String p = strs[0];

        for(int i = 1 ; i < strs.length ; i++){
            while(! strs[i].startsWith(p)){
                p = p.substring(0, p.length() - 1);

                }

        }
        if(p.isEmpty()){
            p = "";
        }
        return p;
    }
}