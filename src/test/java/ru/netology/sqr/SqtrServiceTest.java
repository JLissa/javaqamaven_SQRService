package ru.netology.sqr;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SqtrServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    public void SqrtCounterMatch(int expected ,int minLimit, int maxLimit) {
        SqrtService service = new SqrtService();

        int actual = service.calcSqrt(minLimit, maxLimit);

        Assertions.assertEquals(expected, actual);
    }
}