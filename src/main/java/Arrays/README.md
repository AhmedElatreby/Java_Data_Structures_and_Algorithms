### Arrays

![img.png](img.png)
***
## Single Dimension Array
```java
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
}
```
![img_1.png](img_1.png)

***
Traversal Array
```java
public void traversalArray() {
        try{
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }

    }
```
![img_2.png](img_2.png)
***
Search for an element in the given Array
```java
 public void searchInArray(int valueToSearch){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToSearch) {
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found!");
    }
```
![img_3.png](img_3.png)
***
Delete value from Array
```java
    public void deleteValue(int valueToDeleteIndex){
       try{
           array[valueToDeleteIndex] = Integer.MIN_VALUE;
           System.out.println("The value has been deleted successfully");
       } catch (ArrayIndexOutOfBoundsException e){
           System.out.println("The value that is provided is not in the range of array");
       }
    }
```
![img_4.png](img_4.png)
***
## Two Dimension Array

```java
public class TwoDimensionalArray {
    int arr[][] = null;

    // Constructor
    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting value in the array
    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("The value is successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array!");
        }
    }
}
```
![img_5.png](img_5.png)