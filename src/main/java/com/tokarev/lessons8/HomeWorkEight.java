package com.tokarev.lessons8;

public class HomeWorkEight {

    public static void main(String[] args) {

        String[][] array = new String[10][10];

        populateArray(array);
        printArray(array);
        arrayValue(array);
        arrayValueOne(array);
        arrayValueTwo(array);

        System.out.println();

        printArray(array);
    }

    public static void populateArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ".";
            }
        }
    }

    public static void printArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayValue(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = "-";
        }
    }

    public static void arrayValueOne(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j > i) {
                    array[i][j] = "0";
                }
            }
        }
    }

    public static void arrayValueTwo(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j < i) {
                    array[i][j] = "1";
                }
            }
        }
    }
}
