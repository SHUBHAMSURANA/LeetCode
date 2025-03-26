class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> h = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> h1 =  new PriorityQueue<>(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));

        for (int x : nums) {
            h.put(x, h.getOrDefault(x,0)+1);
        }

       

       for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            h1.offer(entry);
        }

         System.out.println(h1.toString());
        int a[] = new int[k];

        int j=0;
        while(j<k) {
            a[j] = h1.poll().getKey();
            j++;
        }

        return a;

    }
}
