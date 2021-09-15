package com.frolov.dz3.controllers;

import com.frolov.dz3.classesOfAnimals.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class ListController {

    public void list(ArrayList<Animal> animals, Scanner scanner, String inputAdd) {

        while (!inputAdd.equals("exit")) {

            System.out.println("Введено list");
            System.out.println("exit-В главное меню");

            for (int i = 0; i < animals.size(); i++) {
                System.out.println(animals.get(i));

            }

            inputAdd = scanner.next().trim().toLowerCase();

            if (inputAdd.equals("exit")) {
                System.out.println("В главное меню");
            } else {
                System.out.println("Если хотите выйти напишите exit");
            }
        }
    }
}
