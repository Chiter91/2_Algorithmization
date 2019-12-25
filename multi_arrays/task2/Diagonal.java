package multi_arrays.task2;

/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

import java.util.Scanner;

public class Diagonal {
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

        System.out.println("\nВыводим элементы стоящие на главной диагонли : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }
    }
}
