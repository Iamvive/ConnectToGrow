package javaprogram;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment {
    public static void main(String[] args) {
        int[] array = new int[2]; //[ 0 , 0 ] //address [0, 1]

        array[0] = 10; // 10
        array[1] = 20; // 20

        int secondElement = array[1];
        int firstEle = array[0];
        arrayHandling(array);
        arrayHandling(new int[]{56, 90});
        arrayHandling(new int[]{100, 50});
//        System.out.println(Arrays.toString(array));
//        System.out.println(secondElement);
    }

    public static void arrayHandling(int[] secondArray) {
        // [10, 20]
        int firstNumber = secondArray[0];
        secondArray[0] = secondArray[1]; //[20, 20]
        secondArray[1] = firstNumber; //[20, 10]

        System.out.println(Arrays.toString(secondArray));
    }
}
