package com.company;

public class Main {


    public static void main(String[] args) {

        int[] intArray = new int[] { 5,6,7,2,4 };

        bubbleSort(intArray);
        for (int i : intArray) {
            System.out.println(i);
        }
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
