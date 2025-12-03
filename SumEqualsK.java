class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(0, 1);       // important: prefix sum = 0 exists once

        int sr = 0;        // prefix sum
        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            sr = sr + nums[i];    // curr prefix sum

            int find = sr - k;    // look for needed prefix

            if (h.containsKey(find)) {
                c += h.get(find);
            }

            h.put(sr, h.getOrDefault(sr, 0) + 1);
        }

        return c;
    }
}

