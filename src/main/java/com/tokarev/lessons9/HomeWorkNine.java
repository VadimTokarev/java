package com.tokarev.lessons9;

public class HomeWorkNine {

    public static void main(String[] args) {

        String[][] array = new String[10][10];

        populateArray(array);
        editArray(array);
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
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void editArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][i] = "+";
            }
        }
    }
}
