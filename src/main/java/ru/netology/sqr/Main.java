package ru.netology.sqr;

public class Main {

    public static void main(String[] args) {

        SqrtService service = new SqrtService();
        System.out.println(service.calcSqrt(100, 300));
    }
}