import java.lang.*;
import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {
        insertShiftArray(new int []{1,5,6,7,8,3,2}, 9);
    }

    public static void insertShiftArray(int [] arr, int num){
        int len = (arr.length+1);
      int[] newArr = new int[len];
      int index = 0;
      int middle =(int)Math.ceil(((arr.length+1)/2));
        for(int i =0; i < arr.length; i++ ){
        System.out.println(arr[i]);
            if (index == middle){
                newArr[middle]= num;
                index = middle +1;
                i = i-1;
            }
            else if(index != middle){
                newArr[index] = arr[i];
                index++;
            }
        }
      System.out.println(Arrays.toString(newArr));
    }
}