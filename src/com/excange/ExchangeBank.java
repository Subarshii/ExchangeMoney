package com.excange;

import java.util.Scanner;


public class ExchangeBank {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result result = new Result();
        int temp;
        int amount;
        int input = sc.nextInt();
        while (input > -1) {
            if (input <= 0) {
                input = sc.nextInt();
            } else {
                if (input >= 1000) {
                    temp = input;
                    input = input % 1000;
                    amount = temp / 1000;
                    result.bank1000 = amount;
                    System.out.println("bank 1000 " + result.bank1000 + " unit");

                } else if (input >= 500) {
                    temp = input;
                    input = input % 500;
                    amount = temp / 500;
                    result.bank500 = amount;
                    System.out.println("bank 500 " + result.bank500 + " unit");

                } else if (input >= 100) {
                    temp = input;
                    input = input % 100;
                    amount = temp / 100;
                    result.bank100 = amount;
                    System.out.println("bank 100 " + result.bank100 + " unit");

                } else if (input >= 50) {
                    temp = input;
                    input = input % 50;
                    amount = temp / 50;
                    result.bank50 = amount;
                    System.out.println("bank 50 " + result.bank50 + " unit");

                } else if (input >= 20) {
                    temp = input;
                    input = input % 20;
                    amount = temp / 20;
                    result.bank20 = amount;
                    System.out.println("bank 20 " + result.bank20 + " unit");

                } else if (input >= 10) {
                    temp = input;
                    input = input % 10;
                    amount = temp / 10;
                    result.bank10 = amount;
                    System.out.println("coin 10 " + result.bank10 + " coin");

                } else if (input >= 5) {
                    temp = input;
                    input = input % 5;
                    amount = temp / 5;
                    result.bank5 = amount;
                    System.out.println("coin 5 " + result.bank5 + " coin");

                } else if (input >= 1) {
                    temp = input;
                    input = input % 1;
                    amount = temp / 1;
                    result.bank1 = amount;
                    System.out.println("coin 1 " + result.bank1 + " coin");
                    input = sc.nextInt();

                }

            }
        }
    }
}


