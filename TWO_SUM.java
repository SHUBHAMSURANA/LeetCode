class Solution {
    public int[] twoSum(int[] n, int t) {
       HashMap <Integer, Integer> x = new HashMap<>();
       ArrayList<Integer> list = new ArrayList<>();
       for (int i=0; i<n.length; i++) {
            int rsum = t-n[i];
          
            if (x.containsKey(rsum)) {
                return new int[]{x.get(rsum), i};
            }
            x.put(n[i],i);
       }
            return new int[0];
    }
}
