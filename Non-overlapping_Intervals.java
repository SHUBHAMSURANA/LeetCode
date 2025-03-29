class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        int max = 0;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1],b[1]));
        if (intervals[0].length > 0) {
            int startend = intervals[0][1];

            for (int j =1; j <intervals.length; j++ ) {
                
                if (intervals[j][0] < startend) {
                    System.out.println(intervals[j][0] +" "+intervals[j][1]);
                    max++;
                }
                else {
                    startend =  intervals[j][1];
                }
            }
        } 


        return max;
    }
}
