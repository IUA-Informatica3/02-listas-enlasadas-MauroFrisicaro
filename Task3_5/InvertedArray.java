/*  Escriba un método recursivo que imprima los elementos de un arreglo en orden inverso. */

package Task3_5;

import java.util.Scanner;

public class InvertedArray {
    public static void main(String[] args) {
        int size, counter = 1;
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.print("Size of the Array: ");
            size = input.nextInt();

            if (size < 1) {
                System.out.println("Wrong Input.\n");
            } else {
                flag = false;
            }
        }
        while (flag);

        int array[] = new int[size];
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element [%d]: ", counter);
            array[i] = input.nextInt();
            counter++;
        }

        System.out.println("\nThe Flipped Array.");
        flipArr(array, array.length);
    }

    public static int flipArr(int a[], int n) {
        if (n == 0) {
            return a[n];
        } else {
            System.out.print(a[n - 1] + " ");
            return flipArr(a, n - 1);
        }
    }
}