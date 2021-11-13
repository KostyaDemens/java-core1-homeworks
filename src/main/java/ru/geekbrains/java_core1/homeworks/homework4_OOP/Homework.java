package ru.geekbrains.java_core1.homeworks.homework4_OOP;

public class Homework {
    public static void main(String[] args) {
        Employee[] employee = new Employee[3];
        employee[0] = new Employee("Vova", "Manager", "Vova@gmail.com", 1234567, 2500, 55);
        employee[1] = new Employee("Kolya", "Waiter", "Kolya@gmail.com", 6322341, 2000, 23);
        employee[2] = new Employee("Oleg", "Boss", "Oleg@gmail.com", 7324735, 4000, 43);

        for (int i = 0; i < employee.length; i++) { ///Проходимся по массиву сотрудников
            if (employee[i].getAge() > 40) { ///Проверям возраст каждого сотрудника
                System.out.println(employee[i] + "\n");
            }
        }

    }
}
