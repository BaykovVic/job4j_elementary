package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] input) {
        int[] result = new int[input.length];
        for (int index = 0; index < input.length; index++) {
            result[input.length - index - 1] = input[index];
        }
        return result;
    }
}
