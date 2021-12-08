package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short mHeight) {
        return (mHeight - 100) * 1.15;
    }

    public static double womanWeight(short wHeight) {
        return (wHeight - 110) * 1.15;
    }

    public static void main(String[] args) {
        short mHeight = 180;
        short wHeight = 170;
        double man = Fit.manWeight(mHeight);
        double woman = Fit.womanWeight(wHeight);
        System.out.println("Man " + mHeight + " is " + man);
        System.out.println("Woman " + wHeight + " is " + woman);
    }

}