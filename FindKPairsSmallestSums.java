import java.lang.reflect.Array;
import java.util.*;

public class FindKPairsSmallestSums {

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        // TODO: Write your logic here
        // HINT 1: Use a PriorityQueue (min-heap) sorted by sum = nums1[i] + nums2[j]
        // HINT 2: Start by pushing all (nums1[i], nums2[0]) pairs into the heap
        // HINT 3: Each time you pop a pair (i, j), push the next candidate (i, j+1)
        // HINT 4: Stop when you've collected k pairs OR the heap is empty

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        PriorityQueue<int[]> x = new PriorityQueue<>((a,b)->Integer.compare(a[0]+a[1], b[0]+b[1]));
        for (int i=0;i< nums1.length;i++) {
            for (int j=0;j< nums2.length;j++) {
                x.offer(new int[]{nums1[i],nums2[j]});
            }
        }


        int j=0;
        List<List<Integer>> l = new ArrayList<>();
        while (j<k && x.size()>0) {
            List<Integer> t = new ArrayList<>();
            //System.out.println("data" + Arrays.stream(x.poll()).boxed().toList().toString());
            //t.add(Arrays.asList(x.poll()));
            l.add(Arrays.stream(x.poll()).boxed().toList());
            j++;
        }




        return l; // remove once implemented
    }

    public static void main(String[] args) {
        // Test 1: normal case
        int[] nums1a = {1, 7, 11};
        int[] nums2a = {2, 4, 6};
        System.out.println("Test 1: " + kSmallestPairs(nums1a, nums2a, 3));
        // Expected: [[1,2],[1,4],[1,6]]

        // Test 2: duplicate values
        int[] nums1b = {1, 1, 2};
        int[] nums2b = {1, 2, 3};
        System.out.println("Test 2: " + kSmallestPairs(nums1b, nums2b, 2));
        // Expected: [[1,1],[1,1]]

        // Test 3: k larger than total pairs
        int[] nums1c = {1, 2};
        int[] nums2c = {3};
        System.out.println("Test 3: " + kSmallestPairs(nums1c, nums2c, 5));
        // Expected: [[1,3],[2,3]]

        // Test 4: negative numbers
        int[] nums1d = {-10, -4, 0, 0, 6};
        int[] nums2d = {3, 5, 6, 7, 8, 100};
        System.out.println("Test 4: " + kSmallestPairs(nums1d, nums2d, 4));
        // Expected: [[-10,3],[-10,5],[-10,6],[-10,7]]
    }
}
