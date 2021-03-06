package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer = "";

        while(!answer.equals("нет")) {
            System.out.print("Введите первое число: ");
            calc.setNum1(scan.nextInt());

            System.out.print("Введите знак математической операции: ");
            calc.setMathOperator(scan.next().charAt(0));

            System.out.print("Введите второе число: ");
            calc.setNum2(scan.nextInt());

            calc.calculate();

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scan.next();
            } while(!answer.equals("да") && !answer.equals("нет"));
        }
    }
}