package com.company.main.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ConversionClass<T> {

    public <T> void conversionMethod(ArrayList<T> list, T[] mas, boolean flagArrayToList) {

        if (mas == null) return;

        if (flagArrayToList) {

            list = new ArrayList();

            for (int i = 0; i < mas.length; i++) {
                list.add(mas[i]);
            }

            //Collections.addAll(list, mas);
        } else {

            if (list == null) return;

            mas = list.toArray(mas);
        }
    }
}
