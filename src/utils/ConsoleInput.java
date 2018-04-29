package utils;

import interfaces.input;

import java.util.Scanner;

/**
 * Ввод в консоль
 * Denis
 * 29.04.2018
 */

public class ConsoleInput implements input {
    private Scanner scanner;

    public ConsoleInput() {
        scanner = new Scanner(System.in);
    }

    @Override
    public int enterNumber() {
        int number;
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                scanner.nextLine();
            }
        }
        return number;
    }

}
