package utils;

import interfaces.Input;

import java.util.Scanner;

/**
 * Ввод в консоль
 * Denis
 * 29.04.2018
 */

public class ConsoleInput implements Input {
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
