package ru.geekbrains.java_core1.homeworks.homework5_OOP_inheritage.ZooPark.Zoo;

public class Dog extends Animals{

    public Dog(String name) {
        super(name); //super - то же, что и this, только ссылаемся на родительский класс
    }

    public void run(int runLength) {
        if (runLength > 40) {
            System.out.println("Собака не может столько пробежать");
        } else {
            System.out.printf("%s пробежал %d\n", name, runLength);
        }
    }

    public void swim(int swimLength) {
        if (swimLength > 50) {
            System.out.println("Собака не может столько проплыть");
        } else {
            System.out.printf("%s проплыл: %d\n", name, swimLength);
        }
    }


}
