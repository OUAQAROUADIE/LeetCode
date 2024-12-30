class Solution {
    public String addBinary(String a, String b) {
      int i = a.length()-1;
      int j = b.length()-1;
      int tmp = 0;
      StringBuilder sb  = new StringBuilder();
      while(i >= 0 || j >= 0 || tmp != 0){
        int s = tmp;
        if(i >= 0){
            s += a.charAt(i) - '0';
            i--;
        }
        if(j >= 0){
            s += b.charAt(j) - '0';
            j--;
        }
        sb.append(s % 2);
        tmp = s / 2;
      }
      return sb.reverse().toString();
    }
}