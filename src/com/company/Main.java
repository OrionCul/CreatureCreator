package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*******************************************************");
        System.out.println("*****************CREATURE CREATOR 4.20*****************");
        System.out.println("*******************************************************\n");

        System.out.print("Enter the number of eyes your creature will have: ");
        int numberOfEyes = input.nextInt();

        System.out.print("Enter the number of arms your creature will have: ");
        int numberOfArms = input.nextInt();

        System.out.print("Enter the number of legs your creature will have: ");
        int numberOfLegs = input.nextInt();

        System.out.println("\nGENERATING CREATURE.....\n");

        Creature creatureObject = new Creature(numberOfEyes, numberOfArms, numberOfLegs);

        creatureObject.printCreatureStats();

        
    }
}