package Arrays.Array_example;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 2};
        int[] result = twoSum(arr, 7);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (target == arr[i] + arr[j]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("not found");
    }
}

