package BigO;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("----------calculate the sum and product of elements of array ------- ");
        CalculateSum cal = new CalculateSum();
        int[] customArray= {1,3,4,5,};
        cal.somOfArray(customArray);

        System.out.println("----------calculate the sum and product of elements of array ------- ");
        PrintPairsOfNumbers printPairs = new PrintPairsOfNumbers();

        printPairs.printNumbers(customArray);

    }

}
