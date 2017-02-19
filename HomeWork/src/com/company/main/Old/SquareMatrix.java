package com.company.main.old;

import java.util.*;

public class SquareMatrix {
    private int n = 5;
    private int rowCenter;
    private int columnCenter;
    private int rowMax;
    private int columnMax;
    private double maxElement = 0;
    private double mas[][] = new double[n][n];
    private Random random = new Random();

    public void initMas() {
        HashSet<Double> hashSet = new HashSet();
        for (int i = 0; i < (n * n); i++) {
            hashSet.add(random.nextDouble() * 100);
        }

        Iterator<Double> iterator = hashSet.iterator();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = iterator.next();
            }
        }
    }

    public void searchMaxElement() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && j == (n - 1 - i)) {
                    rowCenter = i;
                    columnCenter = j;
                }
                if (i == j || j == (n - 1 - i)) {
                    if (mas[i][j] > maxElement) {
                        maxElement = mas[i][j];
                        rowMax = i;
                        columnMax = j;
                    }
                }
            }
        }
    }

    public void transformationMas() {
        searchMaxElement();
        double k;
        k = mas[rowCenter][columnCenter];
        mas[rowCenter][columnCenter] = maxElement;
        mas[rowMax][columnMax] = k;
    }

    public void printMas() {
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.printf("%.2f\t", mas[i][j]);
            }
        }
        System.out.println();
    }
}
