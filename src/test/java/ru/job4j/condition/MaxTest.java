package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int a = 1;
        int b = 2;
        int result = Max.max(a, b);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4And1To8Then8() {
        int a = 4;
        int b = 1;
        int c = 8;
        int result = Max.max(a, b, c);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3And3And15To0Then15() {
        int a = 3;
        int b = 3;
        int c = 15;
        int d = 0;
        int result = Max.max(a, b, c, d);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }
}