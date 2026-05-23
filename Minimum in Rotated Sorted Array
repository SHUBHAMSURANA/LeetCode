class Solution {
    public int findMin(int[] n) {

        int i=0;
        int j= n.length-1;
        int min = Integer.MIN_VALUE;
        int mid=0;

        while (i<=j) {
            mid = (j+i)/2;

            if (mid<j && n[mid]>n[mid+1]) {
                i = mid+1;
            }
            else if (i<mid && n[mid]>n[mid-1]) {
                j= mid-1;
            }
            else{
                return n[mid];
            }
        }

        return n[mid];
        
    }
}
