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

        float in = 140;
        float rToEexpected = 2;
        float rToDexpected = 2;
        float dToRexpected = 8400;
        float eToRexpected = 9800;
        float out = Converter.rubleToEuro(in);
        float out1 = Converter.rubleToDollar(in);
        float out2 = Converter.dollarToRuble(in);
        float out3 = Converter.euroToRubles(in);
        boolean passed = rToEexpected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        boolean passed1 = rToDexpected == out1;
        System.out.println("140 rubles are 2 dollars. Test result : " + passed1);
        boolean passed2 = dToRexpected == out2;
        System.out.println("140 dollars are 8400 rubles. Test result : " + passed2);
        boolean passed3 = eToRexpected == out3;
        System.out.println("140 euro are 9800 rubles. Test result : " + passed3);
    }
}
