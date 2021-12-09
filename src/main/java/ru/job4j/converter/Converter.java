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
        float in = 140;
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars.");
        expected = 2.3333333f;
        out = Converter.rubleToDollar(in);
        boolean passed1 = expected == out;
        System.out.println("140 rubles are about 2 dollars. Test result : " + passed1);

        float dtr = Converter.dollarToRuble(140);
        System.out.println("140 dollars are " + dtr + " rubles.");
        expected = 8400;
        out = Converter.dollarToRuble(in);
        boolean passed2 = expected == out;
        System.out.println("140 dollars are 8400 rubles. Test result : " + passed2);

        float etr = Converter.euroToRubles(140);
        System.out.println("140 euro are " + etr + " rubles.");
        expected = 9800;
        out = Converter.euroToRubles(in);
        boolean passed3 = expected == out;
        System.out.println("140 euro are 9800 rubles. Test result : " + passed3);
    }
}
