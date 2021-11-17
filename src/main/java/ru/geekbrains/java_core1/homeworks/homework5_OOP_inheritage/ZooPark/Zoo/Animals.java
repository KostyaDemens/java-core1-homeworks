package ru.geekbrains.java_core1.homeworks.homework5_OOP_inheritage.ZooPark.Zoo;

public abstract class Animals {
    protected String name;

    public Animals(String name) {
        this.name = name;
    }

    public String getName() { //Gett ер позволяет получить значение
        return name;
    }

    public void setName(String name) { // Sett ер позваляет изменить его
        this.name = name;
    }

    public void run(int runLength) {
        System.out.printf("%s пробежал %d\n", name, runLength);
    }

    public void swim(int swimLength) {
        System.out.printf("%s проплыл: %d\n", name, swimLength);
    }

}
