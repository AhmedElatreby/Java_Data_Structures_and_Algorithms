package BigO;

public class PrintPairsOfNumbers {
    void printNumbers(int[]  n) {

        for (int i = 0; i < n.length ; i++) { // O(n)
            for (int j = 0; j <n.length ; j++) { // O(n)
                System.out.println(n[i]+ ", " + n[j]); // O(1)
                // The Time Complexity: O(n^2)
            }
        }
    }
}
