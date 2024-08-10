class Solution {
    public int lengthOfLongestSubstring(String s) {

        // Create 2 hash map
        // one hash map for window freq
        // one hash map for character position in array.
        Map<Character,Integer> loc = new HashMap<>();
        Map<Character,Integer> freq = new HashMap<>();
        int max = 0;
        int left =0;
        for(int right = 0;right<s.length();right++){

            char curr = s.charAt(right);
            freq.put(curr, freq.getOrDefault(curr, 0)+1);

            if (freq.get(curr) > 1 && loc.get(curr) >= left) {
                left = loc.get(curr)+1;
                freq.put(curr, freq.get(curr)-1);
            }

            max = Math.max(max, right-left+1);
            loc.put(curr, right);
        }
        return max;
    }
}
