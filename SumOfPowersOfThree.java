public class SumOfPowersOfThree {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int a = 23, b = 55, c = 91;
        System.out.println("In the case of a it's "+solution.checkPowersOfThree(a)+" In the case of b it's "+solution.checkPowersOfThree(b)+" In the case of c it's "+solution.checkPowersOfThree(c));
    }
}
class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            //at the last in n % 3 == 1 then we can get it 
            if (n % 3 == 2) return false;
            n /= 3;
        }
        return true;
    }
}