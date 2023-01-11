package Arrays.Array_example;

public class Permutation {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 10};
        int[] arr2 = {1, 3, 5, 2, 4, 6, 10};

        boolean result = permutation(arr1, arr2);
        System.out.println(result);
    }

    public static boolean permutation(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 1;
        int mul2 = 1;

        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
            sum2 += arr2[i];
            mul1 *= arr1[i];
            mul2 *= arr2[i];
        }

        if (sum1 == sum2 && mul1 == mul2) {
            return true;
        }
        return false;
    }
}
