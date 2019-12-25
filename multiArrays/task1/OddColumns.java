package multiArrays.task1;

/*
Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

import java.util.Scanner;

public class OddColumns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер квадратной матрицы : ");
        int n = sc.nextInt();
        int[][] array = new int[n][n];

        System.out.println("\nВыводим сгенерированную матрицу: ");
        for (int i = 0; i < array.length; i++) {        //заполняем матрицу рандомными значениями
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10) + 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nВыводим нечетные столбцы:");
        for (int j = 0; j < array.length; j +=2) {     //смотрим нечетные стобцы
            if (array[0][j] > array[array.length - 1][j]) {  //если первый элемент больше последнего

                System.out.print("Столбец № " + (j + 1) + " : ");

                for (int i = 0; i < array.length; i++) {   //выводим данный столбец
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
