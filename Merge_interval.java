  // If there are no intervals, return empty array
        if (intervals.length == 0) {
            return new int[0][];
        }
        
        // Sort intervals by the starting value of each interval
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        // List to store the merged intervals
        List<int[]> merged = new ArrayList<>();
        
        // Start with the first interval
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);
        
        // Iterate over all the intervals
        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
            
            // Check if there is an overlap with the current interval
            if (nextStart <= currentEnd) {
                // If overlapping, merge the intervals by extending the end time
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // If not overlapping, move to the next interval
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }
        
        // Convert list to 2D array and return
        return merged.toArray(new int[merged.size()][]);
