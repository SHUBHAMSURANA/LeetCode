class Solution {
    public List<List<Integer>> threeSum(int[] n) {
        Arrays.sort(n);
        List<List<Integer>> r = new ArrayList<List<Integer>>();
        HashMap<Integer,Integer> x = new HashMap<>();
        Set<List<Integer>> tx = new HashSet<>();
        //HashMap<ArrayList<Integer>,Integer> p = new HashMap<>();
        for (int i=0;i<n.length;i++) {
            x.put(n[i],i);
        }

        for (int i=0;i<n.length;i++) {
            int t = n[i]*-1;
             for (int j=i+1;j<n.length;j++) {
                int z = n[j]*-1;
                int f = t+z;
                if (x.get(f)!= null && x.get(f)>i && x.get(f)>j) {
                    ArrayList<Integer> arr = new ArrayList<Integer>();
                    arr.add(n[i]);
                    arr.add(n[j]);
                    arr.add(f);
                    tx.add(Arrays.asList(n[i],n[j],f));
                    //System.out.println(arr);
                    //if (p.get(arr) == null) {
                      //   p.put(arr,1);
                        // r.add(arr);
                    //}
                    
                }
             }   
        }
        return new ArrayList<>(tx);
    }
}
