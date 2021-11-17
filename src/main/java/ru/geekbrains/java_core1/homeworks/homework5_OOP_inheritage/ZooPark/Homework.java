package ru.geekbrains.java_core1.homeworks.homework5_OOP_inheritage.ZooPark;

import ru.geekbrains.java_core1.homeworks.homework5_OOP_inheritage.ZooPark.Zoo.Animals;
import ru.geekbrains.java_core1.homeworks.homework5_OOP_inheritage.ZooPark.Zoo.Cat;
import ru.geekbrains.java_core1.homeworks.homework5_OOP_inheritage.ZooPark.Zoo.Dog;

public class Homework {
    public static void main(String[] args) {

        Cat cat = new Cat("Pushistic");
        Dog dog = new Dog("Tuzik");


        cat.run(40);
        cat.swim(60);
        dog.run(50);
        dog.swim(50);


    }
}
