package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {4, 7, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 4, 7};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf10elements() {
        int[] data = new int[] {5, 3, 6, 4, 8, 1, 9, 0, 2, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertArrayEquals(expected, result);
    }
}