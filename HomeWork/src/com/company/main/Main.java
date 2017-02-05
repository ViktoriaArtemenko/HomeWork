package com.company.main;

import com.company.main.Old.Dictionary;
import com.company.main.Old.SortArray;
import com.company.main.Old.SquareMatrix;

public class Main {

    private static String[] surname = {"Leblanc", "Sartorius", "Rockelle", "Mackenzie", "Grande", "Bratayley",
            "Grace", "Orlando", "Hancher", "Gomez"};
    private static String[] name = {"Annie", "Jacob", "Piper", "Ziegler", "Hayley", "Annie", "Hayley", "Lauren",
            "Kristen", "Johnny"};
    private static String[] birthday = {"11.06.2004", "12.11.2004", "13.01.2004", "14.07.2004", "06.06.2004",
            "16.05.2004", "17.07.2004", "18.09.2004", "19.07.2004", "20.08.2004"};

    private static String nameSurname = "Annie Leblanc";
    private static int n;

    public static void main(String[] args) {
        MapTreasures mapTreasures = new MapTreasures();
        mapTreasures.computeCoordinates();
        System.out.println("Координаты:  " + mapTreasures.getCoordinates());
        System.out.println();

        dictionary();                            //old home work
        sMatrix();
        sortArray();
    }

    public static void sMatrix() {
        System.out.print("\nSquareMatrix");
        SquareMatrix squareMatrix = new SquareMatrix();
        squareMatrix.initMas();
        squareMatrix.printMas();
        squareMatrix.transformationMas();
        squareMatrix.printMas();
    }

    public static void sortArray() {
        System.out.print("\nSortArray");
        SortArray sortArray = new SortArray();
        sortArray.initMas();
        sortArray.printMas();
        sortArray.sortMas();
        sortArray.printMas();
    }

    public static void dictionary() {
        Dictionary dictionaryOne = new Dictionary();
        dictionaryOne.initDictionary(surname, name);

        Dictionary dictionaryTwo = new Dictionary();
        dictionaryTwo.initDictionary(surname, birthday);

        dictionaryOne.printDictionary();
        dictionaryTwo.printDictionary();

        n = dictionaryOne.searchCoincidence(nameSurname);
        dictionaryTwo.deleteBirthdaySummer();

        System.out.println();

        System.out.println(nameSurname + ": " + n + " совпадений.");
        dictionaryTwo.printDictionary();
    }
}
