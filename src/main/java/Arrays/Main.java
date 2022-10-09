package Arrays;

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
    }
}
