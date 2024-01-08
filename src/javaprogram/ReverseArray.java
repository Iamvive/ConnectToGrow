package javaprogram;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};

        int firstDigit = array[0];
        array[3] = array[2];
        array[2] = array[1];
        array[1] = array[0];
        array[0] = firstDigit;

        System.out.println("Array is "+ Arrays.toString(array));
    }
}
