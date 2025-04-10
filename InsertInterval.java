class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> r = new ArrayList<>();

        int l = intervals.length;
        int i =0;

        while (i<l && newInterval[0]> intervals[i][1]) {
            r.add(intervals[i]);
            i++;
        }

        int start = newInterval[0];
        int end = newInterval[1];
         while (i < l && intervals[i][0] <= newInterval[1]) {
            start = Math.min(intervals[i][0], start);
            end = Math.max(intervals[i][1], end);
            i++;
        }
       
        r.add(new int[]{start,end});

        while (i<l && newInterval[1] < intervals[i][0]) {
            r.add(intervals[i]);
            i++;
        }


        return r.toArray(new int[r.size()][]);
        
    }
}
