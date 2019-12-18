package arrays.task6;

/*
Задана последовательность N вещественных чисел.
Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */

import java.util.Scanner;

public class SumOfPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер последовательности: ");
        int n = sc.nextInt();
        double[] array = new double[n];
        double count = 0;
        boolean isPrime;

        System.out.println("Выводим сгенерированную последовательность: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * n) +1;
            System.out.print(array[i] + " ");
        }

        System.out.println();

        count += array[1];     //сумируем число под порядковым номером 2
        for(int i = 3; i <= n; i++) {
            isPrime = true;
            for(int j = 2; j <= i; j++) {
                if(i % j == 0 && i != j) {
                    isPrime = false;   //если условие выполняется то это составное число
                    break;
                }
            }

            if (isPrime == true) {   //сумируем все простые числа
                count += array[i-1];
            }
        }
        System.out.println("Сумма: " + count);
    }
}
