class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> re = new ArrayList<>();

        for (int i=0;i<nums.length-2;i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int t = nums[i] *(-1);

            int l = i+1;
            int r = nums.length-1;

            while (l<r) {
                int sum = nums[l]+nums[r];
                if (sum==t) {
                    re.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while (l<r && nums[l] == nums[l+1]) {l++;}
                    while (l<r && nums[r] == nums[r-1]) {r--;}

                    l++;
                    r--;
                }
                else if (sum>t) {
                    r--;
                }
                else {
                    l++;
                }
            }
        }
        
        return re;
    }
}
