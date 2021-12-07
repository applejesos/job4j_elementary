package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double opOne = x2 - x1;
        double opTwo = y2 - y1;
        double opThree = Math.pow(opOne, 2);
        double opFour = Math.pow(opTwo, 2);
        double opFive = opThree + opFour;
        return Math.sqrt(opFive);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) is " + result);
        double result1 = Point.distance(34, 44, 67, 3);
        System.out.println("result (34, 44) to (67, 3) is " + result1);
    }
}
