package icu.cyclone.alex;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type max number: ");
        System.out.println(Arrays.toString(primeNumbers(sc.nextInt())));
    }

    public static int[] primeNumbers(int max) {
        boolean[] arr = new boolean[max + 1];
        for (int i = 3; i < Math.sqrt(max + 1); i++) {
            if (arr[i]) {
                continue;
            }
            for (int j = i * 3; j < max + 1; j += i * 2) {
                arr[j] = true;
            }
        }

        int count = 1;
        for (int i = 3; i < max + 1; i += 2) {
            if (!arr[i]) {
                count += 1;
            }
        }

        int[] result = new int[count];
        int k = 0;
        result[k++] = 2;

        for (int i = 3; i < max + 1; i += 2) {
            if (!arr[i]) {
                result[k++] = i;
            }
        }

        return result;
    }
}
