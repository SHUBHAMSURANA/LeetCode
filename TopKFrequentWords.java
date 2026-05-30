class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // Step 1: Count frequencies
        HashMap<String, Integer> h = new HashMap<>();
        for (String s : words) {
            h.merge(s, 1, Integer::sum);
        }

        // Step 2: Max-heap by frequency, tie-break by alphabetical order
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
            Comparator.comparing(Map.Entry<String, Integer>::getValue, Comparator.reverseOrder())
                      .thenComparing(Map.Entry::getKey)
        );

        pq.addAll(h.entrySet());   // FIX 1: addAll, not add

        // Step 3: Poll top K and extract keys
        List<String> result = new ArrayList<>();
        while (!pq.isEmpty() && k > 0) {
            result.add(pq.poll().getKey());   // FIX 2: extract the word
            k--;
        }
        return result;
    }
}
