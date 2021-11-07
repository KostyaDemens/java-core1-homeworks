package ru.geekbrains.java_core1.homeworks.homework3;

import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
//        arrReplacement();
//        arrToHundred();
//        multiplyBy2();
//        massivs();
//        arrayLength();

    }


    public static void arrayLength() {
        int len = 20; //Длинна массива
        String initialValue = "Hello"; //Содержание массива
        int[] arr = new int[len];
        for (int i = 0; i <arr.length; i++) {
            System.out.println(initialValue);
        }
    }

    public static void massivs() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static void multiplyBy2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.println(arr[i]);
        }
    }

    public static void arrToHundred() {
        int[] arr = new int[100];
        for (int i = 0; i <= arr.length; i++) {
            System.out.print(i + " ");
        }
    }

    private static void arrReplacement() {
        int[] arr = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }


}
