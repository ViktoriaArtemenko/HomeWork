package com.company.main.main;

import com.company.main.generic.ChangePositionClass;
import com.company.main.generic.ConversionClass;
import com.company.main.generic.LibraryClassWithGeneric;
import com.company.main.generic.MaxElementClass;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    private static String[] masString = {"cat", "dog", "panda", "bird"};
    private static Integer[] masInteger = {11, 45, 10, 9, 34, 65, 33, 75};
    private static String[] masString2;
    private static ArrayList<String> listString = new ArrayList();
    private static ArrayList<Integer> listInteger = new ArrayList();

    public static void main(String[] args) {
        ChangePositionClass<String> changeStr = new ChangePositionClass();
        ChangePositionClass<Integer> changeInt = new ChangePositionClass();

        changeStr.changePositionOfArray(0, 3, masString);
        changeInt.changePositionOfArray(1, 2, masInteger);

        printArray(masString);
        System.out.println();
        printArray(masInteger);
        System.out.println("\n**************************");

        //**************************

        MaxElementClass<Integer> maxElement = new MaxElementClass();
        Collections.addAll(listInteger, masInteger);
        maxElement.findMaxElement(0, 4, listInteger);

        //**************************

        System.out.println("\n**************************");
        ConversionClass<String> conversionClass = new ConversionClass();

        Collections.addAll(listString, masString);
        masString2 = new String[listString.size()];

        conversionClass.conversionMethod(listString, masString2, false);

        printArray(masString2);
        System.out.println();

        //**************************

        System.out.println("\n**************************");
        LibraryClassWithGeneric<String> library = new LibraryClassWithGeneric("Bulgakov");
        library.printElement(library, library.getBook());
    }

    public static <T> void printArray(T[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print("[" + mas[i] + "], ");
        }
    }
}
