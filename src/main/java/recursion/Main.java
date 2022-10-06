package recursion;

class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        var fac = factorial.factorial(25);
        System.out.println("factorial of 25 is: " + fac);

        System.out.println("--------------------------");

        Fibonacci fibonacci = new Fibonacci();
        var fib = fibonacci.fibonacci(35);
        System.out.println("fibonacci of 100 is: " + fib);
    }
}
