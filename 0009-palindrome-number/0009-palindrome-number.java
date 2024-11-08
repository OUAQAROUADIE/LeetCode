class Solution {
    public boolean isPalindrome(int x) {
        String n = Integer.toString(x);
        String r = new StringBuilder(n).reverse().toString();

        return n.equals(r);

       /* String n = Integer.toString(x);
       String r="";
       for(int i = n.length()-1  ; i >=0 ; i--){
        r+= n.charAt(i);
       }
       if(n.equals(r)){
        return true;
       }
       return false;
    }*/
    }
}