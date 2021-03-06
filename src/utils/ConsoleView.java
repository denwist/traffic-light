package utils;

import interfaces.View;

/**
 * Визуальное отображение в консоли
 * Denis
 * 29.04.2018
 */

public class ConsoleView implements View {
    @Override
    public void showLine(String... strings) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (String string : strings) {
            stringBuilder.append(string);
        }
        System.out.print(stringBuilder.toString());
    }

    @Override
    public void showLineln(String... strings) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (String string : strings) {
            stringBuilder.append(string);
        }
        System.out.println(stringBuilder.toString());
    }
}
