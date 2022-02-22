package com.company;

import java.util.Random;

public class Main {


    public static void main(String[] args) {

        int sizeOfArray = 1000;
        int [] arrayToSort;
        arrayToSort = bubbleSort(createArray(sizeOfArray));
        for (int i : arrayToSort) {
            System.out.println(i);
        }
    }

    private static int [] createArray(int sizeOfArray) {

        Random rand = new Random();
        int[] createdArray = new int[sizeOfArray];

        for (int i=0; i < sizeOfArray - i; i++) {
            createdArray[i] = rand.nextInt(1000);
        }

        return createdArray;
    }

    private static int[] bubbleSort(int[] sortedArray) {

        int arraySize = sortedArray.length - 1;
            for (int i =0; i < arraySize; i++) {

                for (int j=0; j < arraySize - i; j++) {

                    if (sortedArray[j] > sortedArray[j + 1]) {
                        int temp = sortedArray[j];
                        sortedArray[j] = sortedArray[j + 1];
                        sortedArray[j + 1] = temp;

                    }
                }
            }
        return sortedArray;
    }
}
