package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainSumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digitsSum = 0;

        while (number !=0) {
            System.out.println("Число = " + number);
            int currentDigit = number % 10;
            System.out.println("текущее число = " + currentDigit);
            digitsSum = digitsSum + currentDigit;
            System.out.println("сумма чисел = " + digitsSum);
            number = number / 10;
        }
    }
}
