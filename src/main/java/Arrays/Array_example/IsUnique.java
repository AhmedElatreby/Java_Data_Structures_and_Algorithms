package Arrays.Array_example;

public class IsUnique {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 50};

        boolean result = isUnique(arr);

        System.out.println(result);

    }

    public static boolean isUnique(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }

            }

        }

        return true;
    }
//    public boolean isUnique(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i +1; j < array.length ; j++) {
//                if (array[i] == array[j]) {
//                    return false;
//                }
//            }
//
//        }
//        return true;
//    }
}
