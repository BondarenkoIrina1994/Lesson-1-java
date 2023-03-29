// (ДОПОЛНИТЕЛЬНАЯ) 
// Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, 
// например 2? + ?5 = 69 (пользователь). 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет. 
// под знаками вопроса - одинаковые цифра 
// Ввод: 2?+?5=69

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите уравнение: ");
        String equation = input.next();
        int number_1, number_2, unknown_number;
        int sum_number_1 = Character.getNumericValue(equation.charAt(6));
        int sum_number_2 = Character.getNumericValue(equation.charAt(7));
        if ((Character.isDigit(equation.charAt(0))) & (Character.isDigit(equation.charAt(4)))) {
            number_1 = Character.getNumericValue(equation.charAt(0));
            number_2 = Character.getNumericValue(equation.charAt(4));
            unknown_number = Math.abs(number_1 - sum_number_1);
            System.out.printf("%d%d + %d%d = %d%s", number_1, unknown_number, unknown_number, number_2, sum_number_1,
                    equation.charAt(7));
        } else {
            if ((Character.isDigit(equation.charAt(1))) & (Character.isDigit(equation.charAt(3)))) {
                number_1 = Character.getNumericValue(equation.charAt(1));
                number_2 = Character.getNumericValue(equation.charAt(3));
                unknown_number = Math.abs(number_2 - sum_number_1);
                System.out.printf("%d%d + %d%d = %d%s", unknown_number, number_1, number_2, unknown_number,
                        sum_number_1, equation.charAt(7));
            } else {
                if ((Character.isDigit(equation.charAt(1))) & (Character.isDigit(equation.charAt(4)))) {
                    number_1 = Character.getNumericValue(equation.charAt(1));
                    number_2 = Character.getNumericValue(equation.charAt(4));
                    unknown_number = Math.abs(sum_number_1 / 2);
                    System.out.printf("%d%d + %d%d = %d%s", unknown_number, number_1, unknown_number, number_2,
                            sum_number_1, equation.charAt(7));
                } else {
                    number_1 = Character.getNumericValue(equation.charAt(0));
                    number_2 = Character.getNumericValue(equation.charAt(3));
                    unknown_number = Math.abs(sum_number_2 / 2);
                    System.out.printf("%d%d + %d%d = %s%d", number_1, unknown_number, number_2, unknown_number,
                            equation.charAt(6), sum_number_2);
                }
            }
        }
    }
}
