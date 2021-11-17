package com.company;

import java.util.Scanner;

public class MainSimpleSequence {

    public static void main(String[] args) {
        //int i = 0;
    Scanner scanner = new Scanner(System.in);
        int eventsNumbersCount = 0;
        int oddNumbersCount = 0;
        int currentNumber = scanner.nextInt();

        while (currentNumber != -1) {
            // число четное
            if (currentNumber % 2 == 0) {
                eventsNumbersCount = eventsNumbersCount + 1; //eventsNumbersCount++;
            } else {
                oddNumbersCount++;
            }
            currentNumber = scanner.nextInt();
        }
        System.out.println("Odd Number Count = " + oddNumbersCount);
        System.out.println("Even Number Count = " + eventsNumbersCount);
    }
}
