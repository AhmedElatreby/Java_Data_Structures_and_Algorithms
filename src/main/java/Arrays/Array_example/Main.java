package Arrays.Array_example;

import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        MissingNumber mNumber = new MissingNumber();
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        mNumber.missingNumber((intArray));

        TwoSum tSum = new TwoSum();
        int[] array = {2,5,9,4,20,7};
//        int[] sum = tSum.twoSum(array,9);
//        System.out.println(Arrays.toString(sum));

        System.out.println();
        System.out.println("Find number in array");
        FindNumber fnumber = new FindNumber();
        fnumber.findNumber(array, 20);

        MaxProductOfTwoNumbers mProduct = new MaxProductOfTwoNumbers();
        int[] intArray1 = {10, 20, 30, 40, 50, 60};
        String pairs = mProduct.maxProduct(intArray1);
        System.out.println(pairs);

        System.out.println();
        System.out.println("Find number is unique in array");
        IsUnique isUniqueNumber = new IsUnique();
        int[] numbers = {10, 20, 30, 40, 10, 50};
        boolean unique =  isUniqueNumber.isUnique(numbers);
        System.out.println((unique));

        System.out.println();
        System.out.println("Permutation");
        Permutation permutation = new Permutation();
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {5, 6, 4, 3, 1, 2};
        boolean permutationArray = permutation.permutation(array1,array2);
        System.out.println(permutationArray);

        System.out.println();
        System.out.println("Rotate Matrix");
        RotateMatrix rm = new RotateMatrix();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rm.rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));





    }
}
