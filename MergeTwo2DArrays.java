import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 2570: Merge Two 2D Arrays by Summing Values
 * 
 * Given two 2D integer arrays, merge them based on the first column values.
 * If two elements have the same first column value, sum their second column values.
 * The result should be sorted in ascending order of the first column.
 * 
 * https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/
 */
public class MergeTwo2DArrays {
    public static void main(String[] args) {
        // Example usage (optional)
        Solution solution = new Solution();
        int[][] nums1 = {{1, 2}, {2, 3}, {4, 5}};
        int[][] nums2 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] result = solution.mergeArrays(nums1, nums2);

        // Printing the result
        for (int[] row : result) {
            System.out.println(row[0] + ", " + row[1]);
        }
    }

    /**
     * Merges two 2D arrays by summing values with the same first column key.
     */
    static class Solution {
        public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
            List<int[]> res = new ArrayList<>();
            int p1 = 0, p2 = 0;
            int m = nums1.length, n = nums2.length;

            while (p1 < m && p2 < n) {
                if (nums1[p1][0] == nums2[p2][0]) {
                    res.add(new int[]{nums1[p1][0], nums1[p1][1] + nums2[p2][1]});
                    p1++;
                    p2++;
                } else if (nums1[p1][0] < nums2[p2][0]) {
                    res.add(nums1[p1]);
                    p1++;
                } else {
                    res.add(nums2[p2]);
                    p2++;
                }
            }
            // Add remaining elements
            while (p1 < m) res.add(nums1[p1++]);
            while (p2 < n) res.add(nums2[p2++]);

            return res.toArray(new int[res.size()][]);
        }
    }
}
