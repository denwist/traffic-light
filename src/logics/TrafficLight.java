package logics;

import utils.ConsoleInput;
import utils.ConsoleView;

import java.util.Scanner;

/**
 * Игровой процесс
 * Denis
 * 29.04.2018
 */

public class TrafficLight {
    private ConsoleInput consoleInput;
    private ConsoleView consoleView;

    public TrafficLight() {
        consoleInput = new ConsoleInput();
        consoleView = new ConsoleView();
    }

    public void start() {
        consoleView.showLineln("Консольная программа светофор.");
        int minutes;
        String color = null;
        do {
            consoleView.showLine("Введите количество минут (выход -1): ");
            minutes = consoleInput.enterNumber();
            minutes = (minutes >= 10 && minutes % 10 == 0) ? 10 : minutes % 10;

            if(minutes >= 0) {

                if (minutes <= 2) {
                    color = "Зеленый";
                } else if (minutes <= 5) {
                    color = "Желтый";
                } else {
                    color = "Красный";
                }

                consoleView.showLineln("Цвет: " + color);
            }
        } while (minutes != -1);
    }
}
