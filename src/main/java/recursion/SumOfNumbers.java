package recursion;

public class SumOfNumbers {
    public int sumOfNumbers(int n) {
        // Base case
        if (n <= 0) {
            return 0;
        }
        return  n%10 + sumOfNumbers(n/10);
    }
}
