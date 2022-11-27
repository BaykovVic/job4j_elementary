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
        float inEU = 140;
        float inUSD = 120;
        float expectedEU = 2;
        float expectedUSD = 2;
        float outEU = Converter.rubleToEuro(inEU);
        float outUSD = Converter.rubleToDollar(inUSD);
        boolean passedRUB2EU = outEU == expectedEU;
        boolean passedRUB2USD = outUSD == expectedUSD;
        System.out.println(inEU + " rubles are " + outEU + " euro. " + passedRUB2EU);
        System.out.println(inUSD + " rubles are " + outUSD + " dollar. " + passedRUB2USD);
    }
}
