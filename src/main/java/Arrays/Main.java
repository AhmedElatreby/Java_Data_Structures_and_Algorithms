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
    }
}
