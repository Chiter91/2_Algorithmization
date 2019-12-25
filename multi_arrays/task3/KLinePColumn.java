package multi_arrays.task3;

/*
Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

import java.util.Scanner;

public class KLinePColumn {
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

        System.out.print("\nВведите номер строки [1-" + n + "] : ");
        int line = sc.nextInt();
        System.out.print("Введите номер столбца [1-" + n + "] : ");
        int column = sc.nextInt();

        System.out.println("\nСтрока:");
        for (int i = 0; i < array[line - 1].length; i++) {
            System.out.print(array[line - 1][i] + " ");
        }

        System.out.println("\n\nСтолбец:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][column - 1] + " ");
        }
    }
}
