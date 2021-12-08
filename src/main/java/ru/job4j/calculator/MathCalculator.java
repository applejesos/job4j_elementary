package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divAndDiff(double first, double second) {
        return div(first, second)
                + diff(first, second);
    }

    public static double cmonGuysAllTogether(double first, double second) {
        return sumAndMultiply(first, second) + divAndDiff(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат первого расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат второго расчета равен: " + divAndDiff(10, 20));
        System.out.println("Сумма вычислений всех операция равна: " + cmonGuysAllTogether(10, 20));
    }
}
