import java.lang.*;
import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {
        insertShiftArray(new int[] { 1, 5, 6, 7, 8, 3, 2 }, 9);
    }

    public static void insertShiftArray(int[] arr, int num) {
        int len = (arr.length + 1);
        int[] newArr = new int[len];
        int referencePoint = 0;
        int midLocation = (int) Math.ceil(((arr.length + 1) / 2));
        for (int x = 0; x < arr.length; x++) {
            // System.out.println(arr[i]);
            if (referencePoint == midLocation) {
                newArr[midLocation] = num;
                referencePoint = midLocation + 1;
                x = x - 1; // to avoid skipping over the immediate element after the midLocation element so reverse x by 1.
            } else if (referencePoint != midLocation) {
                newArr[referencePoint] = arr[x];
                referencePoint++;
            }
        }
        // System.out.println(Arrays.toString(newArr));
    }
}