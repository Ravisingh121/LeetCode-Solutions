import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet();
        int left = 0, right = 0;

        while(right < n){
            char currentChar = s.charAt(right);
            if(!charSet.contains(currentChar)){
                charSet.add(currentChar);
                maxLength = Math.max(maxLength, charSet.size());
                right++;
            }else{
                charSet.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
        
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb")); 
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }
}