import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println(Arrays.toString(reverseArray(new int[] { 1, 2, 4, 6, 79,6,4,8,19,89,8,2,34, })));
    }

    public static int[] reverseArray(int[] arr) {
        int length = arr.length;
        int[] reversedArray = new int[length];
        int count = 0;
        for (int x = arr.length - 1; x >= 0; x--) {
            reversedArray[count] = arr[x];
            count++;
        }
        return reversedArray;
    }
}