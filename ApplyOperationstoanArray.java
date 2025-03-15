public class ApplyOperationstoanArray {

    public static void main(String[] args) {
        
    }
    class Solution {
        public int[] applyOperations(int[] nums) {
            int n = nums.length;
    
            for (int i = 0; i < n - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    nums[i] *= 2;  
                    nums[i + 1] = 0;  // Set next element to zero
                }
            }
    
            // Shift all non-zero elements to the front
            int index = 0;  
            for (int i = 0; i < n; i++) {
                if (nums[i] != 0) {
                    nums[index++] = nums[i];  //move nnzero to forward
                }
            }
    //Fill out wiht zero (remaingng space)
            while (index < n) {
                nums[index++] = 0;
            }
    
            return nums;
        }
    }
    
}