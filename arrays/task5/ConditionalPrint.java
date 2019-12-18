package arrays.task5;

/*
Даны целые числа a1, a2, ..., аn. Вывести на печать только те числа, для которых ai > i.
 */

import java.util.Scanner;

public class ConditionalPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Выводим сгенерированный массив:");
        for(int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * n) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Выводим отфильтрованный массив:");
        for(int i = 0; i < array.length; i++) {
            if (array[i] > i + 1) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
