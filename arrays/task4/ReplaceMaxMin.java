package arrays.task4;

/*
Даны действительные числа a1, a2, ..., an. Поменять местами наибольший и наименьший элементы.

 */

import java.util.Scanner;

public class ReplaceMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        int max, min, maxIndex, minIndex, temp;

        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (20 + 1)) - 10;     //[-10 ; 10]
            System.out.print(array[i] + " ");
        }
        System.out.println();

        max = min = maxIndex = minIndex = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                maxIndex = i;
            } else if(array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;

        for(int i : array) {
            System.out.print(i + " ");
        }
    }
}
