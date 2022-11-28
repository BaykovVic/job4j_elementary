package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = out == expected;
        System.out.println(in + " rubles are " + out + " euro. " + passed);
        in = 120;
        expected = 2;
        out = Converter.rubleToDollar(in);
        passed = out == expected;
        System.out.println(in + " rubles are " + out + " dollar. " + passed);
    }
}
