
package ru.geekbrains.java_core1.homeworks.homework2;

public class HW2 {
    public static void main(String[] args) {
//        System.out.println(Counter());
//        PositiveOrNegative(-1);
//        System.out.println(PositiveOrNegative2(100));
//        Writing();
    }

    private static boolean Counter() {
        int a = 3;
        int b = 6;
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static void PositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean PositiveOrNegative2(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void Writing() {
        int a = 5;
        String b = "Hello";
        for (int i = 0; i < a; i++) {
            System.out.println(b);
        }
    }


}

