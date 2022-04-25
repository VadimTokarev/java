package com.tokarev.lessons10;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkTen {

    public static void main(String[] args) {
        String data = "Hello World!";

        System.out.println("Work example charAt :");
        for (int i = 0; i < data.length(); i++) {
            System.out.print(data.charAt(i) + " ");
        }
        System.out.println();

        System.out.println("Work example contains : " + data.contains("ll"));

        if (data.startsWith("He")) {
            data = "User " + data;
        }
        System.out.println(data);

        if (data.endsWith("llo")) {
            data = data + "!";
        }
        System.out.println(data);

        // equals
        String test = "abcd";
        System.out.println(test.equals(data));

        //equalsIgnoreCase
        String testTwo = "Abcd";
        System.out.println(test.equalsIgnoreCase(testTwo));

        //format
        int age = 20;
        String name = "Alex";
        String text = "My name is %s my age is %s";
        text = String.format(text, name, age);
        System.out.println(text);

        //indexOf
        System.out.println(data.indexOf("el"));

        //isEmpty
        String s = "";
        System.out.println(s.isEmpty());

        //length

        //replace
        data = data.replace("Hello", "Good");
        System.out.println(data);

        //substring
        System.out.println(text.substring(3,7));

        //trim
        String alex = "   Alex ";
        System.out.println(alex.trim());

        //toLowerCase
        System.out.println(text.toLowerCase());

        //toUpperCase
        System.out.println(text.toUpperCase());

        //split
        String textTwo = "My name is Alex";
        String[] chars = textTwo.split(" ");
        System.out.println(Arrays.toString(chars));

        // 2 задание
        int values = maxValues(7,9,15);
        System.out.println(values);


        // 3 задание
        System.out.println("Enter the string you want to check for a palindrome:");
        Scanner scanner = new Scanner(System.in);
        String userData = scanner.nextLine();
        System.out.println("Palindrome : " + palindrome(userData));

        String check = "123";

    }

    public static boolean palindrome(String userData) {
        StringBuilder sb = new StringBuilder(userData);
        String text = sb.reverse().toString();
        return userData.trim().equalsIgnoreCase(text.trim());
    }

    public static int maxValues(int... values) {
        for (int i = 0; i < values.length; i++) {
            if (i<i+1)
        }
        return 1;
    }

    public static boolean(String check) {
        
    }

}

