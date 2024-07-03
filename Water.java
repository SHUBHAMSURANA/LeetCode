class Solution {
    public int maxArea(int[] h) {
        int j = h.length-1;
        int i = 0;
        int sum = Integer.MIN_VALUE;
        while (i<j) {
            int t;
            if (h[i] < h [j]) {
                t  = h[i] * (j-i);
                i++;
            }
            else {
                t =  h[j] * (j-i);
                j--;
            }

            sum = Math.max(sum,t);
        }
        
        return sum;
    }
}
