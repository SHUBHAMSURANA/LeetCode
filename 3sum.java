class Solution {
    public List<List<Integer>> threeSum(int[] n) {
        Arrays.sort(n);
        HashMap<Integer,Integer> x = new HashMap<>();
        Set<List<Integer>> tx = new HashSet<>();
        for (int i=0;i<n.length;i++) {
            x.put(n[i],i);
        }

        for (int i=0;i<n.length;i++) {
            int t = n[i]*-1;
             for (int j=i+1;j<n.length;j++) {
                int z = n[j]*-1;
                int f = t+z;
                if (x.get(f)!= null && x.get(f)>i && x.get(f)>j) {
                    tx.add(Arrays.asList(n[i],n[j],f));  
                }
             }   
        }
        return new ArrayList<>(tx);
    }
}
