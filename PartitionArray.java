class PartitionArray {
    public static void main(String[] args) {
        
    }
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
}