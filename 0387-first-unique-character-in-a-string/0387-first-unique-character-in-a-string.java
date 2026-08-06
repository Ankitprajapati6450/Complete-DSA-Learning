import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        
        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        
        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (map.get(ch) == 1) {
                return i;
            }
        }
        
        return -1; // if no unique character found
    }
}