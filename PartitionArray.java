import java.util.Arrays;

class PartitionArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 5, 11, 20, 6, 7, 3, 2, 6};
        int pivot = 6;

        // Correct way to print an array
        System.out.println(Arrays.toString(solution.pivotArray(nums, pivot)));
    }
}
//Soltuion function
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n-1;
        int leftRes = 0, rightRes = n - 1;

        while (left < n) {
            if (nums[left] < pivot) 
                result[leftRes++] = nums[left];
            if (nums[right] > pivot)
                result[rightRes--] = nums[right];
            left++;
            right--;    
        }
        while (leftRes <= rightRes)
            result[leftRes++] = pivot;
        return result;
    }
}