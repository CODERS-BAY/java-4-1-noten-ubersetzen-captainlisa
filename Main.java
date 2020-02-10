package com.codersbay;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Gib eine Zahl zwischen 1 und 5 ein");

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        switch (number) {
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Genügend");
                break;
            case 5:
                System.out.println("Nicht Genügend");
                break;

        }
    }
}
