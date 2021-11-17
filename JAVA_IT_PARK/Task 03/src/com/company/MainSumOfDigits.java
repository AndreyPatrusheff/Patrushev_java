package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainSumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digitsSum = 0;

        while (number !=0) {
            System.out.println("number = " + number);
            int currentDigit = number % 10;
            System.out.println("current digit = " + currentDigit);
            digitsSum = digitsSum + currentDigit;
            System.out.println("digit sum = " + digitsSum);
            number = number / 10;
        }
    }
}
