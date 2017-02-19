package com.company.main.generic;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;

public class MaxElementClass<T> {

    public <T> void findMaxElement(int begin, int end, ArrayList<T> list) {
        if (list == null || begin >= list.size() || end >= list.size()) return;

        TreeSet<T> tTreeSet = new TreeSet<T>();
        ListIterator<T> listIterator = list.listIterator(begin);
        int k;
        while (listIterator.hasNext()) {
            k = listIterator.nextIndex();
            tTreeSet.add(listIterator.next());
            if (k == end) break;
        }
        System.out.println("Max element: " + tTreeSet.last());
    }
}
