package Arrays;

public class SingleDimensionArray {
    int array[] = null;

    public SingleDimensionArray(int sizeOfArray) {
        array = new int[sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted) {
        try {
            if (array[location] == Integer.MIN_VALUE) {
                array[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    }

    // Array Traversal

    public void traversalArray() {
        try{
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }

    }
}
