package com.company.main;

public class Main {

    public static void main(String[] args) {
        SquareMatrix squareMatrix = new SquareMatrix();
        squareMatrix.initMas();
        squareMatrix.printMas();
        squareMatrix.transformationMas();
        squareMatrix.printMas();

        sortArray();
    }

    public static void sortArray() {
        System.out.print("\nSortArray");
        SortArray sortArray = new SortArray();
        sortArray.initMas();
        sortArray.printMas();
        sortArray.sortMas();
        sortArray.printMas();
    }
}
