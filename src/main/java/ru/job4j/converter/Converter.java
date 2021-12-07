package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float dollarToRuble(float value) {
        return value * 60;
    }

    public static float euroToRubles(float value) {
        return value * 70;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars.");
        float dtr = Converter.dollarToRuble(140);
        System.out.println("140 dollars are " + dtr + " rubles.");
        float etr = Converter.euroToRubles(140);
        System.out.println("140 euro are " + etr + " rubles.");
    }
}
