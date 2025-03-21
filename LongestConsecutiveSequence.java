class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        
        HashSet<Integer> h = new HashSet<>();
        for (int a : nums) {
            h.add(a);
        }

        int count =1;
        for (int i=0;i<nums.length;i++) {
            int t = nums[i]+1;
            if (!h.contains(nums[i] - 1)) {
                int x =1;
                while (h.contains(t)) {
                    t++;
                    x++;
                }

                count = Math.max(x,count);
            }
        }


        return count;

    }
}
