package arrays.task9;

/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если таких чисел несколько, то определить наименьшее из них.
 */

import java.util.Scanner;

public class MostNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        int[] occurrencesArray = new int[n];  //массив с количеством вхождений
        int min;  //минимальное значение элемента с максимальным вхождением
        int maxOccurrences; //максимальное число вхождений

        System.out.println("Выводим сгенерированный массив: ");
        for (int i = 0; i < array.length; i++) {  //заполняем массив рандомными значениями
            array[i] = (int) (Math.random() * 10) + 1;
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {  //считаем количество вхождений всех чисел
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    occurrencesArray[i] += 1;  //записываем количество вхождений в новый массив
                }
            }
        }

        min = array[0];
        maxOccurrences = occurrencesArray[0];

        for (int i = 1; i < occurrencesArray.length; i++) {
            if (maxOccurrences < occurrencesArray[i]) {
                maxOccurrences = occurrencesArray[i];
                min = array[i];
            } else if (maxOccurrences == occurrencesArray[i]) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
        }
        System.out.println("\nОтвет: " + min);
    }
}
