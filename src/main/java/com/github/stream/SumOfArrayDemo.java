package com.github.stream;

import java.util.Arrays;

public class SumOfArrayDemo {
    public static void main(String[] args) {
        int[] array = {23, 43, 56, 97, 32};
        int sum = Arrays.stream(array).sum();
        System.out.println(sum);

        sum = Arrays.stream(array).reduce(0, (x, y) -> x + y);
        System.out.println(sum);

        sum = Arrays.stream(array).reduce(0, Integer::sum);
        System.out.println(sum);

        sum = Arrays.stream(array).reduce(0, SumOfArrayDemo::addIntData);
        System.out.println(sum);
    }

    public static int addIntData(int num1, int num2) {
        return num1 + num2;
    }
}
