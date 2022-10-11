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
        TwoDimensionalArray twoDA = new TwoDimensionalArray(3,3);
        twoDA.insertValueInTheArray(0,0,10);
        twoDA.insertValueInTheArray(0,1,20);
        System.out.println(Arrays.deepToString(twoDA.arr));

        System.out.println("Accessing Two Dimensional array");
        twoDA.accessCell(0,0);
        twoDA.accessCell(0,1);
        System.out.println("Traverse Two Dimensional array");
        twoDA.travers2DArray();
    }
}
