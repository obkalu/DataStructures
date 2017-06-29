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
        for (Object num : reverseArray(arrNums)) {
            System.out.print(num + " ");
        }
    }

    private static Object[] reverseArray(Object[] array) {
        int n = array.length;

//        int i = 0;
//        while(i < n - (i+1)) {
//            Object temp = array[n-(i+1)];
//            array[n-(i+1)] = array[i];
//            array[i] = temp;
//            i++;
//        }

        for(int i = 0; i < n - (i+1); i++) {
            Object temp = array[n-(i+1)];
            array[n-(i+1)] = array[i];
            array[i] = temp;
        }

        return array;
    }
}
