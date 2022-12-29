package ru.netology.sqr;

import java.util.ArrayList;
import java.util.List;

public class SqrtService {

    public int calcSqrt ( int minLimit, int maxLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {

            int sqrt = i * i;
            if (sqrt >= minLimit && sqrt <= maxLimit) {
                counter++;
            }
        }
        return counter;
    }
}
