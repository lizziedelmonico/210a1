package a1;
import java.util.Arrays;
import java.util.*;
import java.lang.*;

public class arrayMethods {

    /* Returns the sum of all the elements in the array */ 
    public static float wholeSum(float[] arr){
        float sum = 0;
        for (float i = 0;  i < arr.length; i++){
            sum += arr[(int)i];
        }
        return sum;
    }

    /* Returns the sum of a certain selection of numbers in the array */
    public static float sum(float[] arr, int lo, int hi){
        float sum = 0f;
        for (int i = lo; i < hi; i++){
            sum += arr[i];
        }
        return sum;

    }

    /* Uses the sum method and divides by the amount of numbers in the array and returns the mean */
    public static float mean(float[] arr){
        float sum = 0f;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }

    /* Returns the smallest value in a given array */
    public static float min(float[] arr, float min, int hi){
        Arrays.sort(arr);
        min = arr[1];
        if (arr.length == 0){
            return (Float.NaN);
        } else {
            return min;
        }

    }

    /* Returns the largest value in a given array */
    public static float max(float[] arr, float max, int hi) {
        Arrays.sort(arr);
        max = arr[arr.length - 1];
        if (arr.length == 0) {
            return Float.NaN;
        } else {
            return max;
        }
    }

    public boolean[] isEqualTo(float[] arr, float num){
        boolean[] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++){
            if(num == arr[i]){
                arr1[i] = true;
            } else {
                arr1[i] = false;
            }
        } return arr1;
    }

    public float mean(float[] arr, boolean[] boolArr){
        int count = 0;
        float sum = 0f;
        for (int i = 0; i < boolArr.length; i++){
            if(boolArr[i] == true){
                sum += arr[i];
                count++;
            }
        } return sum / count;
    }


    public static boolean[] logicalNot(boolean[] arr){
        boolean [] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == true){
                arr1[i] = false;
            } if(arr[i] == false){
                arr1[i] = true;
            }
        }
        return arr1;
    }


    public static boolean[] isGreaterThan(float[] arr, float num) {
        boolean [] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (num <= arr[i]) {
                arr1[i] = true;
            } if (num >= arr[i]){
                arr1[i] = false;
            }
        }
        return arr1;
    }

    public static boolean[] datesBetween(int[] arr, int lo, int hi){
        boolean[] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= lo && arr[i] <= hi){
                arr1[i] = true;
            } else {
                arr1[i] = false;
            }
        } return arr1;
    }

    public static boolean[] logicalAnd(boolean[] arr, boolean[] arr2){
        boolean[] arr3 = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == arr2[i]){
                arr3[i] = arr[i];
            } else{
                arr3[i] = false;
            }
        }
        return arr3;
    }
    public static int count(boolean[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == true){
                count++;
            }
        } return count;
    }

    public static int findFirst(boolean[] arr){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == true){
                return i;

            }
        }  return -1;
    }

    public static int[] find(boolean[] arr){
        int count = 0;
        int indexCount = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i]){
                count++;
            }
        } int True[] = new int[count];
        for (int i = 0; i < arr.length; i++){
            if(arr[i]){
                True[indexCount] = i;
                indexCount++;
            }
        }
        return True;
    }

    
}
