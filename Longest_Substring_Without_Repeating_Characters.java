class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i=0,j=0;

        HashMap<Character, Integer> h = new HashMap();
        while(i<=j && j<s.length()) {
            char c = s.charAt(j);
            if (h.containsKey(c)) {
                int t = h.get(c);
                while (i<=t) {
                    h.remove(s.charAt(i));
                    i++;
                }
            }
            else {
                h.put(c,j);
                max = Math.max(max,j-i+1);
                j++;
            }
        }

        return max;
    }
}
