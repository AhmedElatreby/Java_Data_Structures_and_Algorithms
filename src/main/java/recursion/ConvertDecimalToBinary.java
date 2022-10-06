package recursion;

public class ConvertDecimalToBinary {
    public int decimalToBinary(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        return ((n %2) + (10 * decimalToBinary(n /2)));
//        System.out.println(n);
    }

}
