class Solution {
    public int longestPalindrome(String s) {
       Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        
        // Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        boolean hasOddFrequency = false;
        
        // Add even frequencies completely to the palindrome
        for (int n : map.values()) {
            if (n % 2 == 0) {
                count += n; // Even frequencies can be fully used
            } else {
                count += n - 1; // Use the even part of odd frequencies
                hasOddFrequency = true; // Remember that we can place one odd character in the center
            }
        }
        
        // If there is at least one character with an odd frequency, we can place one in the center
        if (hasOddFrequency) {
            count++;
        }
        
        return count;
    
    
    }
}