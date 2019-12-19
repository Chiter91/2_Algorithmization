package arrays.task7;

/*
Даны действительные числа a1, а2, ..., а2n.
Найти max(а1 + а2n, а2 + а2n-1, ..., аn + аn+1)
 */

import java.util.Scanner;

public class SumOfRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер последовательности: ");

        int n = sc.nextInt();
        int[] array = new int[n];
        int max = 0;
        int sum;

        System.out.println("Выводим сгенерированную последовательность: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
            System.out.print(array[i] + " ");
        }

        for(int i = 0; i < array.length / 2; i++) {

            sum = array[i] + array[array.length - 1 - i];

            if(max < sum) {
                max = sum;
            }
        }
        System.out.println("\nМаксимальная сумма элементов: " + max);
    }
}
