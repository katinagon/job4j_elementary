package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    public void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFrom9To15Then36() {
        int start = 9;
        int finish = 15;
        int result = Counter.sumByEven(start, finish);
        int expected = 36;
        assertThat(result).isEqualTo(expected);
    }
}