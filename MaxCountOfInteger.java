public class MaxCountOfInteger {
    public static void main(String[] args) { // Added main method
        int[] question = {1, 2, -1, -5, -9, 0, 8, 9};
        Solution solution = new Solution();
        System.out.println(solution.maximumCount(question));
    }
}

class Solution {
    public int maximumCount(int[] nums) {
        int countOdd = 0, countEven = 0; // Fixed variable names
        for (int i = 0; i < nums.length; i++) { 
            if (nums[i] < 0) countOdd += 1; 
            if (nums[i] > 0) countEven += 1; 
        }
        int maximumCountOfNumber = Math.max(countOdd, countEven); 
        System.out.println("The maximum count is " + maximumCountOfNumber); 
        return maximumCountOfNumber; 
    }
}
