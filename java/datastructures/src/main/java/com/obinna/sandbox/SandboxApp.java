package com.obinna.sandbox;

/**
 * Created by obi on 2017-06-28.
 */
public class SandboxApp {

    public static void main(String[] args) {
        Integer[] arrNums = new Integer[]{1,2,3,4,5};
        System.out.print("Input array: ");
        for (Integer num : arrNums) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Reversed array: ");
        for (Object num : reverseArrayInPlace(arrNums)) {
            System.out.print(num + " ");
        }
    }

    /**
     * Reverses an array of Objects, in-place (i.e. without creating a new array),
     * such that the first element becomes last, and the last element becomes first.
     * @param array The array of Object to be reversed
     * @return the same array of Objects
     */
    private static Object[] reverseArrayInPlace(Object[] array) {
        int n = array.length;

        // Method 1: Using a while... loop
//        int i = 0;
//        while(i < n - (i+1)) {
//            Object temp = array[n-(i+1)];
//            array[n-(i+1)] = array[i];
//            array[i] = temp;
//            i++;
//        }

        // Method 2: Using a for... loop
        for(int i = 0; i < n - (i+1); i++) {
            Object temp = array[n-(i+1)];
            array[n-(i+1)] = array[i];
            array[i] = temp;
        }

        return array;
    }
}
