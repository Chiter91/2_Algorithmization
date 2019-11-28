package arrays.task2;

/*
Дана последовательность действительных чисел a1, а2, ... ,an.
Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */

import java.util.Scanner;

public class ReplacingNumbersArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = sc.nextInt();
        int z = 10;
        int counter = 0;
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if(array[i] > z) {
                array[i] = z;
                counter++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\nКол-во замен: " + counter);
    }
}
