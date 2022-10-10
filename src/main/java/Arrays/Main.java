package Arrays;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SingleDimensionArray sArray = new SingleDimensionArray(10);
        sArray.insert(0, 0);
        sArray.insert(1, 10);
        sArray.insert(2, 20);
        sArray.insert(1, 30);
        sArray.insert(12, 120);

        System.out.println("Array Traversal");
        sArray.traversalArray();
        System.out.println();

        System.out.println("Search In An array");
        sArray.searchInArray(20);

        System.out.println();

        System.out.println("Delete a value from the array");
        sArray.deleteValue(1);
        System.out.println(sArray.array[1]);

        System.out.println();

        // Two Dimensional Array
        System.out.println("Two Dimensional array");
        int [][] int2DArray;  // declare array
        int2DArray = new int[2][2]; // instantiate array
        // Initialise Array
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;

        System.out.println(Arrays.deepToString(int2DArray));
        // All together
        String s2DArray[][] = {{"a","b", "c","d"}};
        System.out.println(Arrays.deepToString(s2DArray));


    }
}
