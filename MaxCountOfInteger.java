public class MaxCountOfInteger {
    int[] question = {1, 2, -1, -5, -9, 0, 8, 9};
    Solution solution = new Solution();
    System.out.println(solution.maximumCount(question));
}
class Solution {
    public int maximumCount(int[] nums) {
        int CountOdd = 0, CountEven = 0;
        for (int i = 0; i < nums.length; i++) { 
            if (nums[i] < 0) CountOdd += 1; 
            if (nums[i] > 0) CountEven += 1; 
        }
        int MaximumCountOfNumber = Math.max(CountOdd, CountEven); 
        System.out.println("The maximum Count is " + MaximumCountOfNumber); 
        return MaximumCountOfNumber; 
    }
}
