package ru.geekbrains.java_core1.homeworks.homework5_OOP_inheritage.ZooPark.Zoo;

public class Cat extends Animals {

    public Cat(String name) {
        super(name); //super - то же, что и this, только ссылаемся на родительский класс
    }

    public void run(int runLength) {
        if (runLength > 60) {
            System.out.println("Кошка не может столько пробежать");
        } else {
            System.out.printf("%s пробежал %d\n", name, runLength);
        }
    }

    public void swim(int swimLength) {
        if (swimLength > 70) {
            System.out.println("Кошка не может столько проплыть");
        } else {
            System.out.printf("%s проплыл: %d\n", name, swimLength);
        }
    }
}
