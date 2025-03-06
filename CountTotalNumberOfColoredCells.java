class CountTotalNumberOfColoredCells {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.coloredCells(8));
    }
}
class Solution {
    public long coloredCells(int n) {
        return 1 + 4L * n * (n - 1) / 2;
    }
}