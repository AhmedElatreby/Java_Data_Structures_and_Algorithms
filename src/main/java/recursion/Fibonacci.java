package recursion;

public class Fibonacci {
    public long fibonacci(int n) {
        if (n<0) {
            return -1;
        }
        if (n <= 1) {
            return n;
        }
        return  (fibonacci(n-1) + fibonacci(n-2));
    }

}


