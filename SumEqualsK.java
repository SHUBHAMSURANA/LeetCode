class Solution {
    public int subarraySum(int[] n, int k) {
        //Arrays.sort(nums);
        HashMap<Integer,Integer> h = new HashMap<>();
        int sum=0;
        int count =0;
        for (int i=0;i<n.length;i++) {
            sum+=n[i];
            
            if (sum==k) {
                System.out.println("***"); 
                count++;
            }
            else if (sum>k && h.containsKey(sum-k)) {
                System.out.println(sum-k); 
                System.out.println(h.toString()); 
                System.out.println("*s**"); 
             count++;
            } 
            h.put(sum, i);
        }

        return count;
    }
}
