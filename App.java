package ru.nesterenk.se;

import java.util.Arrays;

/**
 * HW2
 */
public class App {
    public static void main(String[] args) {
        int[] invertArray = {0, 0, 0, 1};
        for (int i = 0; i < invertArray.length; i++)
            switch (invertArray[i]) {
                case 0:
                    invertArray[i] = 1;
                    break;
                case 1:
                    invertArray[i] = 0;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        System.out.println(Arrays.toString(invertArray));

        int[] fillArray = new int[8];
        for (int j = 0; j <= 21; j += 3) {
            System.out.println(j + " ");
        }

        int[] chengeArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int k = 0; k < chengeArray.length; k++) {
            if (chengeArray[k] < 6) {
                chengeArray[k] = chengeArray[k] * 2;
            }
        }
        System.out.println(Arrays.toString(chengeArray));

        int[][] diagonale = new int[3][3];
        int number = 1;
        for (int l = 0; l <= diagonale.length * diagonale[0].length; l++) {
            int row = 0;
            int col = l;

            do {
                if (row < diagonale.length && col < diagonale[row].length) {
                    diagonale[row][col] = number;
                    number++;
                }
                row++;
                col--;
            }
            while (row >= 0);
        }

        System.out.println(Arrays.toString(diagonale));
    }

}