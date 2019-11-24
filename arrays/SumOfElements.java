package arrays;

/*
В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        int k = 3;
        int sum = 0;

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
//                System.out.println(array[i] + " кратно " + k);
                sum += array[i];
            }
        }
        System.out.println("Сумма найденых элементов = " + sum);
    }
}
