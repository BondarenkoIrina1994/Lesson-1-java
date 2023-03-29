// Задача 2
// Вывести все простые числа от 1 до 1000

public class Task2 {
    public static void main(String[] args) {
        System.out.printf("2 ");
        int i = 3;
        while (i < 1000) {
            int j = 2;
            int k = 0;
            while (j <= i - 1) {
                if (i % j == 0) {
                    k = 1;
                    j = i;
                }
                j++;
            }
            if (k == 0)
                System.out.printf("%d ", i);
            i += 2;
        }
    }
}
