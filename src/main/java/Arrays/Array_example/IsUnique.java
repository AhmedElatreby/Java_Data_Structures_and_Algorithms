package Arrays.Array_example;

public class IsUnique {
    public boolean isUnique(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i +1; j < array.length ; j++) {
                if (array[i] == array[j]) {
                    return false;
                }
            }

        }
        return true;
    }
}
