package arrays.task8;

/*
Дана последовательность целых чисел a1, a2, ..., an.
Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1, a2, ..., an).
 */

import java.util.Scanner;

public class CreatingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер последовательности: ");

        int n = sc.nextInt();
        int[] array = new int[n];
        int n2 = 1;
        int min = array[0] = (int) (Math.random() * 100) + 1; //заполняем первый элемент массива и считаем его минимальным

        System.out.println("Выводим сгенерированную последовательность: ");
        System.out.print(array[0] + " ");  //выводим первый элемент массива
        for (int i = 1; i < array.length; i++) { //заполняем оставшиеся элементы
            array[i] = (int) (Math.random() * 100) + 1;
            System.out.print(array[i] + " ");  //и выводим их на экран

            if (min > array[i]) { //если следующий элемент меньше минимального, перезаписываем переменную min
                min = array[i];
                n2 = 1;
            } else if (min == array[i]) { //если минимальных элементов несколько, суммируем количество повторений
                n2 ++;
            }
        }

        int[] newArray = new int[array.length - n2]; //размер нового массива = размер старого - кол-во минимальных значений

        System.out.println("\nВыводим обработанную последовательность:");
        for (int i = 0, j = 0; i < array.length; i++) {
            if (!(array[i] == min)) {
                newArray[j] = array[i];
                System.out.print(newArray[j] + " ");
                j++;
            }
        }
    }
}
