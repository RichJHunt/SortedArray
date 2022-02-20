package com.company;

public class Main {


    public static void main(String[] args) {

        int[] intArray = new int[]{ 5,6,7,2,4 };

        sortArray(intArray);
        for (int i : intArray) {
            System.out.println(i);
        }
    }

    private static int[] sortArray(int[] sortedArray) {
        int[] baseArray = sortedArray;
        int iteration = 0;

            for (int i : baseArray) {
                int currentValue = i;
                int nextIteration = iteration+1;
                int nextValue = baseArray[nextIteration];
                    if (currentValue > nextValue) {
                        int tempInt = baseArray[nextIteration];
                        baseArray[nextIteration] = currentValue;
                        baseArray[iteration] = tempInt;
//                        iteration++;
                    }
            }
        return baseArray;
    }
}
