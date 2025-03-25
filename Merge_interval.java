class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));

        ArrayList<ArrayList<Integer>> a = new ArrayList<>();

        int firstend = intervals[0][0];
        int secondend = intervals[0][1];

        for (int i=1;i<intervals.length;i++) {
            if (secondend>=intervals[i][0]) {
                if (secondend>=intervals[i][1]) {
                    secondend = secondend;
                }
                else {
                    secondend = intervals[i][1];
                }
                
            }
            else {
                a.add(new ArrayList(Arrays.asList(firstend, secondend)));
                firstend = intervals[i][0];
                secondend = intervals[i][1]; 
            }
        }

        a.add(new ArrayList(Arrays.asList(firstend, secondend)));

         // Convert to 2D array
        int rows = a.size();
        int cols = a.get(0).size(); // Assuming all rows have same length
        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = a.get(i).get(j);
            }
        }

        // Printing using nested loops
        for (ArrayList<Integer> row : a) {
            for (Integer num : row) {
                System.out.print(num + " ");
            }
            System.out.println(); // Newline for each row
        }


        return array;
    }
}
