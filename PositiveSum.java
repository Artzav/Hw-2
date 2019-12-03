package com.homework;

public class PositiveSum {
    public static void main(String[] args) {
        int[] array = {5, -10, 7, -2, 36, -30};
        int Sum = 0;
        for (int i : array) {
            if (i > 0) {
                Sum += i;
            }
        }
        System.out.println(Sum);
    }
}
