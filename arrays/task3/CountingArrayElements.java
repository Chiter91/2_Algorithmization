package arrays.task3;

/*
Дан массив действительных чисел, размерность которого N.
Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

 */

import java.util.Scanner;

public class CountingArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        int zero = 0;
        int negative = 0;
        int positive = 0;


        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (20 + 1)) - 10;     //[-10 ; 10]
            System.out.print(array[i] + " ");
        }

        for(int i : array) {
            if(i == 0) {
                zero++;
            } else if (i > 0) {
                positive++;
            } else {
                negative++;
            }
        }
        System.out.printf("\nПоложительных: %d, нулей: %d, отрицательных: %d", positive, zero, negative);
    }
}
