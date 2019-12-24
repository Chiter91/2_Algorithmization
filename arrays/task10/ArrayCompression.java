package arrays.task10;

/*
Дан целочисленный массив с количеством элементов n.
Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
Примечание:
Дополнительный массив не использовать.
 */

import java.util.Scanner;

public class ArrayCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Выводим сгенерированный массив: ");
        for (int i = 0; i < array.length; i++) {  //заполняем массив рандомными значениями
            array[i] = (int) (Math.random() * 10) + 1;
            System.out.print(array[i] + " ");
        }

        int middle = (array.length + 1) / 2;  //записываем середину массива в переменную

        for (int i = 1; i < middle; i++) {   //сжимаем массив
            array[i] = array[i*2];
        }

        for (int i = middle; i < array.length; i++) {  //заполняем нулями свободные элементы
            array[i] = 0;
        }

        System.out.println("\nВыводим сжатый массив: ");
        for (int i: array) {
            System.out.print(i + " ");
        }
    }
}
