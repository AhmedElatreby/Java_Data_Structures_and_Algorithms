package Arrays.Array_example;

public class FindNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        findNumber(arr, 100);

    }

    public static void findNumber(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println(target + " found at index of " + i);
                return;
            }
        }
        System.out.println(target + " not found");
    }
}

