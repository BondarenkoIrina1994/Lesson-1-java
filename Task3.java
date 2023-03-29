// Задача 3
// Реализовать простой калькулятор (+ - / *) 
// Ввод числа -> 
// Ввод знака -> 
// Ввод числа ->

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        double number_1 = input.nextFloat();
        System.out.printf("Введите знак: ");
        String symbol = input.next();
        System.out.printf("Введите второе число: ");
        double number_2 = input.nextDouble();
        if (symbol.equals("+"))
            System.out.printf("%s + %s = %s", number_1, number_2, number_1 + number_2);
        if (symbol.equals("-"))
            System.out.printf("%s - %s = %s", number_1, number_2, number_1 - number_2);
        if (symbol.equals("/"))
            System.out.printf("%s / %s = %s", number_1, number_2, number_1 / number_2);
        if (symbol.equals("*"))
            System.out.printf("%s * %s = %s", number_1, number_2, number_1 * number_2);
        input.close();
    }
}
