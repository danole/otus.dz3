package com.frolov.dz3;

import com.frolov.dz3.classesOfAnimals.Animal;
import com.frolov.dz3.classesOfAnimals.Commands;
import com.frolov.dz3.controllers.AddAnimalController;
import com.frolov.dz3.controllers.ListController;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        AddAnimalController addController = new AddAnimalController();
        ListController listController = new ListController();
        Scanner scanner = new Scanner(System.in);

        String inputMenu = "";

        while (!inputMenu.equals("exit")) {

            System.out.println("add-добавить экземляр животного");
            System.out.println("list-вывести на экран добавленных животных");
            System.out.println("exit-выйти");

            inputMenu = scanner.next().trim().toLowerCase();

            if (inputMenu.equals(Commands.ADD.toString())) {

                addController.add(scanner, animals, inputMenu);

            } else if (inputMenu.equals(Commands.LIST.toString())) {

                listController.list(animals, scanner, inputMenu);

            } else if (inputMenu.equals(Commands.EXIT.toString())) {

                System.out.println("Пока!");

            } else {


                System.out.println("Введено несуществующее значение, введите заново");
            }

        }
    }
}
