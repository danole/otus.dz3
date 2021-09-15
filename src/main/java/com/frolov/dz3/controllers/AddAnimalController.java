package com.frolov.dz3.controllers;

import com.frolov.dz3.classesOfAnimals.*;

import java.util.ArrayList;
import java.util.Scanner;

public class AddAnimalController {

    public void add(Scanner scanner, ArrayList<Animal> animals, String input) {

        while (!input.equals("exit")) {
            System.out.println("Какое животное?");
            System.out.println("Cat");
            System.out.println("Dog");
            System.out.println("Duck");
            System.out.println("exit-В главное меню");

            input = scanner.next().trim().toLowerCase();

            if (input.equals(Commands.CAT.toString()) || input.equals(Commands.DOG.toString()) || input.equals(Commands.DUCK.toString())) {

                Animal animal = null;
                int age;
                int weight;

                if (input.equals(Commands.CAT.toString())) {
                    animal = new Cat();
                } else if (input.equals(Commands.DOG.toString())) {
                    animal = new Dog();
                } else if (input.equals(Commands.DUCK.toString())) {
                    animal = new Duck();
                }

                System.out.println("Введите имя");

                String name = scanner.next().trim().toLowerCase();

                animal.setName(name);

                do {
                    System.out.println("Введите возраст");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Это не число!");
                        scanner.next();
                    }
                    age = scanner.nextInt();
                } while (age <= 0);
                animal.setAge(age);

                do {
                    System.out.println("Введите вес в кг");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Это не число!");
                        scanner.next();
                    }
                    weight = scanner.nextInt();
                } while (weight <= 0);

                animal.setWeight(weight);
                System.out.println("Введите цвет");
                String color = scanner.next().trim().toLowerCase();
                animal.setColor(color);
                animals.add(animal);
                animal.say();

            } else if (input.equals(Commands.EXIT.toString())) {
                System.out.println("В главное меню");
            } else {
                System.out.println("Введите что-то из вышеперечисленного");

            }
        }
    }
}
