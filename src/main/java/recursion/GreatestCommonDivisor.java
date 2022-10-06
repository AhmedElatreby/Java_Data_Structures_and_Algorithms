package recursion;

public class GreatestCommonDivisor {
    public int gcd(int a, int b) {
        // positive number only
        if (b < 0 || a < 0){
            return -1;
        }
        // Base case
        if (b == 0) {
            return a;

        }
        return gcd(b,a%b);
    }
}
