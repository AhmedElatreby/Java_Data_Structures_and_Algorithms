package recursion;

public class CalculatePowerOfNumber {
    public int calculatePowerOfNumber(int base, int exp) {
        // positive number only
        if (exp < 0) {
            return -1;
        }
        // Base case
        if (exp == 0 || exp == 1) {
            return base;
        }
        return base * calculatePowerOfNumber(base ,exp-1);
    }
}
