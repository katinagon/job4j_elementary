package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    public void whenSortArray1() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArray2() {
        int[] data = new int[] {8, 5, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 8, 10};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArray3() {
        int[] data = new int[] {9, 5, 1, 0, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 5, 8, 9};
        assertThat(result).containsExactly(expected);
    }
}