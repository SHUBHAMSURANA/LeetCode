class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> r =  new ArrayList<>();
        ArrayList<Integer> c =  new ArrayList<>();
        int index = 0;
        power(nums, r, index,c);

        return r;
        
    }

    static void power (int[] n , List<List<Integer>> r , int i, ArrayList c) {
        if (i == n.length) {
            r.add(new ArrayList<>(c));
            return;
        }

        c.add(n[i]);
        power(n,r,i+1, c);
        c.remove(c.size() - 1);
        power(n, r, i + 1, c);
    }
}    
    
