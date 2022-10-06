package recursion;

class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Recursion ");

        Factorial factorial = new Factorial();
        var fac = factorial.factorial(25);
        System.out.println("factorial of 25 is: " + fac);

        System.out.println("--------------------------");
        Fibonacci fibonacci = new Fibonacci();
        var fib = fibonacci.fibonacci(30);
        System.out.println("fibonacci of 30 is: " + fib);

        System.out.println("--------------------------");
        SumOfNumbers s2 = new SumOfNumbers();
        System.out.println("The sum Of 222 is = " + s2.sumOfNumbers(222));

        System.out.println("--------------------------");
        CalculatePowerOfNumber calnum = new CalculatePowerOfNumber();
        System.out.println("Calculate the Power Of Number 3*10 = " + calnum.calculatePowerOfNumber(3, 10));

        System.out.println("--------------------------");
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();
        System.out.println("The great common divisor of 4 and 8 is: " + gcd.gcd(4,8));

        System.out.println("--------------------------");

        ConvertDecimalToBinary ctd = new ConvertDecimalToBinary();
        System.out.println("Convert 10 Decimal To Binary = " + ctd.decimalToBinary(10));



    }
}
