package Arrays.Array_example;

public class MaxProductOfTwoNumbers {
    public static void main(String[] args) {
        int[] arr = {20, 10, 30, 50, 40, 60};
        String results = maxProductOfTwoNumbers(arr);
        System.out.println(results);

    }

    public static String maxProductOfTwoNumbers(int[] arr) {
        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] * arr[j] > maxProduct) {
                    maxProduct = arr[i] * arr[j];
                    pairs = Integer.toString(arr[i]) + ", " + Integer.toString(arr[j]);

                }
            }
        }
        return pairs;

    }

}
