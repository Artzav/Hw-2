package com.homework;

public class AverageOfNum {
    public static void main(String[] args) {
        int[] array = {5, 0, -3, 10};

        double sumOfNumbers = 0;
        double averageAmount;

        for (int i = 0; i < array.length; i++) {
            sumOfNumbers += array[i];
        }
        
        averageAmount = sumOfNumbers / array.length;

        System.out.println(averageAmount);
    }
}
