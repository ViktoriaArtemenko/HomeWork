package com.company.main.Old;

import java.util.Random;

public class SortArray extends SquareMatrix {

    private int row = 6;
    private int column = 7;
    private int[][] mas = new int[row][column];
    private Random random = new Random();
    private int n = 30;

    public void initMas() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mas[i][j] = random.nextInt(n);
            }
        }

    }

    public void printMas() {
        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < column; j++) {
                System.out.printf("%d\t", mas[i][j]);
            }
        }
        System.out.println();
    }

    public void sortMas() {
        int k;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column - 1; j++) {
                for (int l = 1; l < column - j; l++) {
                    if (mas[i][j] < mas[i][j + l]) {
                        k = mas[i][j];
                        mas[i][j] = mas[i][j + l];
                        mas[i][j + l] = k;
                    }
                }
            }
        }
    }
}
