package com.company;

public class Main {

    public static void main(String[] args) {
        int fiveThousand = 0;
        int twoThousand = 0;
        int oneThousand = 0;
        int fiveHundred = 0;
        int hundred = 0;
        int fifty = 0;
        int smallMoney = 0;
        int sum = 15867;
        fiveThousand = sum/5000;
        sum %= 5000;
        twoThousand = sum/2000;
        sum %= 2000;
        oneThousand = sum/1000;
        sum %= 1000;
        fiveHundred = sum/500;
        sum %= 500;
        hundred = sum/100;
        sum %= 100;
        fifty = sum/50;
        sum %= 50;
        smallMoney = sum;
        System.out.println("Кол-во купюр 5000 = " + fiveThousand + "\n" + "Кол-во купюр 2000 = " + twoThousand + "\n" +  "Кол-во купюр 1000 = "
                + oneThousand + "\n" + "Кол-во купюр 500 = " + fiveHundred + "\n" + "Кол-во купюр 100 = " + hundred + "\n" + "Кол-во купюр 50 = " + fifty + "\n" + "Остаток = " + smallMoney);
            }
        }