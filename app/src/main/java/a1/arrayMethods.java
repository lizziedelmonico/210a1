package a1;
import java.util.Arrays;
import java.util.*;
import java.lang.*;

public class arrayMethods {

    /** Returns the sum of all the elements in the array
    * @param arr    The array of floats that the method adds to return the sum
    * @return       The sum of the floats in the array
    */
    public static float wholeSum(float[] arr){
        float sum = 0;
        for (float i = 0;  i < arr.length; i++){
            sum += arr[(int)i];
        }
        return sum;
    }

    /** Returns the sum of a certain selection of numbers in the array
    * @param arr    The array of floats that the method adds to return the sum
    * @param lo     The lowest index in the array that is included in the sum
    * @param hi     The highest index in the array that is included in the sum
    * @return       The sum of the specific floats in the array
    */
    public static float sum(float[] arr, int lo, int hi){
        float sum = 0f;
        for (int i = lo; i < hi; i++){
            sum += arr[i];
        }
        return sum;

    }

    /** Uses the sum method and divides by a specific number and returns the mean
    * @param arr    The array of floats that the method uses to calculate the mean
    * @param lo     The lowest index in the array that is included in calculating the mean
    * @param hi     The highest index in the array that is included in calculating the mean
    * @return       The mean of the specific floats in the array
    */
    public static float mean(float[] arr, int lo, int hi){
        float sum = 0f;
        for (int i = lo; i < hi; i++){
            sum += arr[i];
        }
        return sum / (hi-lo);
    }

    /** Uses the sum method and divides by the amount of numbers in the array and returns the mean
     * @param arr   The array of floats that the method uses to calculate the mean
     * @return      The mean of the entire array
     */

    public static float mean(float[] arr){
        float sum = 0f;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        } if(arr.length == 0) {
            return 0.0f;
        }
        return sum / arr.length;
    }

    /** Returns the smallest value in a given array
     * @param arr   The array of floats that the method uses
     * @param min   The smallest value in the array
     * @param hi    The final value in the array
     * @return      The smallest value in the specific indexes of the array
     */
    public static float min(float[] arr, float min, int hi){
        Arrays.sort(arr);
        min = arr[1];
        if (arr.length == 0){
            return (Float.NaN);
        } else {
            return min;
        }

    }

    /**  Returns the largest value in a given array
     * @param arr   The array of floats that the method uses
     * @param max   The largest value in the array
     * @return      The largest value in the given array
     */
    public static float max(float[] arr, float max, int hi) {
        Arrays.sort(arr);
        max = arr[arr.length - 1];
        if (arr.length == 0) {
            return Float.NaN;
        } else {
            return max;
        }
    }

    /** Goes through an array and checks if the values in it are equal to a specific float
     * @param arr   The array of floats that the method uses
     * @param num   The specific number that the array values are being compared to
     * @return      An array of booleans that state whether the corresponding float is equal to the specific float
     */
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

    /** Calcuates the mean of floats within an array, but first converts the float array into a boolean array to see if it's a valid value
     * @param arr       The array of floats that the method uses
     * @param boolArr   The array of booleans that state whether the corresponding float is a valid value
     * @return          The mean of the valid floats in the array
     */
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


    /** Iterates through a boolean array and returns the opposite value
     * @param arr   The boolean array that the method iterates through
     * @return      The opposite boolean of the original array
     */
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

    /** Iterates through an array and returns a boolean depending on whether the float is greater than another specific float
     * @param arr   The array of floats that the method uses
     * @param num   The specific float that the values in the array are compared to
     * @return      A boolean array of which each index states whether the corresponding float is greater than the specific number given
     */
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

    /** Iterates through an array of integers and returns a boolean array stating whether the integer is between two separately designated integers
     * @param arr   The array of integers that the method iterates through
     * @param lo    The lowest integer that the values in the array are being compared to
     * @param hi    The highest integer that the values in the array are being compared to
     * @return      A boolean array of which each index states whether the corresponding integer is between the specific lo and hi integers
     */
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

    /** Takes in two boolean arrays and tests if the values are equal at each index. If they are equal, the boolean value of that index will be returned. If they are not equal, then false will be returned.
     * @param arr   The first array of booleans that is used in the method
     * @param arr2  The second array of booleans that is used in the method
     * @return      A boolean array, where if the corresponding values from each array are equal the value at that index will be returned, and if they are not equal false will be returned.
     */
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

    /** Iterates through a boolean array and counts how many times the value true is found.
     * @param arr   The array of booleans that is used in the method
     * @return      The integer which states how many times the value true was found in the array
     */
    public static int count(boolean[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i]){
                count++;
            }
        } return count;
    }

    /** Iterates through a boolean array and returns the index where the first true value is found. If none are in the array, the integer -1 will be returned.
     * @param arr   The boolean array that is used in the method
     * @return      The index where the first true value is found. If none are found, the integer -1 will be returned.
     */
    public static int findFirst(boolean[] arr){
        for (int i = 0; i < arr.length; i++){
            if(arr[i]){
                return i;

            }
        }  return -1;
    }

    /** Iterates through a boolean array and returns an array of integers which give the indices where the true value is found in the original array
     * @param arr   The boolean array that is used in the method
     * @return      An integer array which give the indices where the true value is found in the original boolean array
     */
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
