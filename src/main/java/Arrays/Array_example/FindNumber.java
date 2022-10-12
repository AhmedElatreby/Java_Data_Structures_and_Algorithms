package Arrays.Array_example;

public class FindNumber {
    public void findNumber(int[] number, int target) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == target) {
                System.out.println(target + " is found at the index of " + i + " in the array");
                return;
            }
        }
        System.out.println(target + " is not found!");
    }
}
