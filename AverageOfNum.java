package com.homework;

public class AverageOfNum {
    public static void main(String[] args) {
        int[] array = {5, 0, -3, 10};
        double numbers = 0;
        double average;
        for (int i = 0; i < array.length; i++) {
            numbers += array[i];
        }
        average = numbers / array.length;
        System.out.println(average);
    }
}
