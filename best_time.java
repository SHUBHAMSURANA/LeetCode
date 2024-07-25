class Solution {
    public int maxProfit(int[] prices) {

        int max=0,b=0,s=0;
        for (int i=0; i< prices.length; i++){
            int z = prices[i];
            if (i==0 || z<b) {
                b=z;
            }
            else {
                if (s<z || z>b) {
                    s = z;
                    max = Math.max(max, s-b);
                }
            }
        }
        return max;
    }
}
