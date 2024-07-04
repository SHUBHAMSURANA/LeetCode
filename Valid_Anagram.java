class Solution {
    public boolean isAnagram(String s, String t) {

        boolean x = false;
        HashMap<Character,Integer> h = new HashMap<>();
        for (char c : s.toCharArray()) {
            h.put(c, h.getOrDefault(c,0)+1);
        }

        HashMap<Character,Integer> h2 = new HashMap<>();
        for (char c : t.toCharArray()) {
            h2.put(c, h2.getOrDefault(c,0)+1);
        }
        
        if (h.equals(h2)) {
            return true;
        }

        return x;
    }
}
