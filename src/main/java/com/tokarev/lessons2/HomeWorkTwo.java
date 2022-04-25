package com.tokarev.lessons2;


public class HomeWorkTwo {
    public static void main(String[] args) { //1 Задание
        byte max = Byte.MAX_VALUE;
        byte min = Byte.MIN_VALUE;
        System.out.println("Minimum for byte = " + min + ", Maximum for byte = " + max);
        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        System.out.println("Minimum for short = " + shortMin + ", Maximum for short = " + shortMax);
        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        System.out.println("Minimum for int = " + intMin + ", Maximum for int = " + intMax);
        long longMax = Long.MAX_VALUE;
        long longMin = Long.MIN_VALUE;
        System.out.println("Minimum for long = " + longMin + ", Maximum for long = " + longMax);

        //2 Задание
        byte byteType = 15;
        short shortType = 30;
        int intType = 10;
        long longType = 20;
        intType = byteType; //Не явное приведение типов 1
        System.out.println("Приведение byte к int = " + intType);
        intType = shortType; //Не явное приведение типов 2
        System.out.println("Приведение short к int = " + intType);
        intType = (int)longType; //Явное привидение 1
        System.out.println("Приведение int к long = " + longType);
        shortType = (short)longType; //Явное приведение 2
        System.out.println("Приведение short к long = " + longType);

        //3 Задание
        byte a = 20;
        short b = 300;
        int c = -350;
        long d = 92236854775807L;
        a = (byte)b;
        System.out.println(a);
        a = (byte)c;
        System.out.println(a);
        c = (int)d;
        System.out.println(c);

    }
}
