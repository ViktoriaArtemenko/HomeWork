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

    public <T extends Number> void printMas(T[][] array, int... n) {
        if (n.length == 1) row = column = n[0];
        else if (n.length == 2) {
            row = n[0];
            column = n[1];
        } else return;

        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < column; j++) {
                //if () System.out.print(array[i][j] + "\t");
                System.out.printf("%.2f\t", array[i][j]);
            }
        }
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
        System.out.println('\n');
    }
}
