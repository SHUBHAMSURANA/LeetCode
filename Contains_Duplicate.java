class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashSet<Integer> z = new HashSet();
         for (int t : nums) {
            if (z.contains(t)) {
                return true;
            }
            else {
                z.add(t);
            }
         }
         return false;
    }
}
