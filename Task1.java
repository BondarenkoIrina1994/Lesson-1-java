
// Задача 1.
// Вычислить n-ое треугольного число(сумма чисел от 1 до n),
// а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = input.nextInt();
        int sum = 0;
        int product = 1;
        for (int i = 1; i <= number; i++) {
            sum += i;
            product *= i;
        }
        System.out.printf("Сумма чисел от 1 до %d равна: %d \n", number, sum);
        System.out.printf("Факториал числа %d равен: %d", number, product);
        input.close();
    }
}
