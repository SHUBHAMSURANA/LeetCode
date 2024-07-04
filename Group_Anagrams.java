class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<HashMap<Character, Integer>, ArrayList<String>> h = new HashMap<>();
        for (String s: strs) {
            HashMap<Character,Integer> m = new HashMap<>();
            
            for (char c : s.toCharArray()) {
                m.put(c, m.getOrDefault(c,0)+1);
            }

            if (h.containsKey(m)) {
                 ArrayList<String> z = h.get(m);
                 z.add(s);
                 //h.put(m,z);
            }
            else {
                //ArrayList<String> z = new ArrayList<>();
                h.put(m, new ArrayList<>());
                
                h.get(m).add(s);
            }
        }

        List<List<String>> t = new ArrayList<>();
        for (Map.Entry<HashMap<Character, Integer>, ArrayList<String>> e: h.entrySet()) {
            System.out.println(e.getValue().toString());
            t.add(e.getValue());
        }
        return t;
    }
}
