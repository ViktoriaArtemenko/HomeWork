package com.company.main.threads;

import com.company.main.threads.BaseClass;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class ClassMaxDivider extends BaseClass {

    private int n = 10000;
    private int optimalNumbersInOneThread = 1000;

    private static LinkedList<Integer> listOfDividers = new LinkedList();
    private static LinkedList<Integer> listIndexMax = new LinkedList();

    public void addElementDividers(int element) {
        listOfDividers.add(element);
    }

    public void run(){

        setStartTime();

        quantityOfThreads = optimalQuantityOfThreads(optimalNumbersInOneThread, n);
        separationResourcesBetweenThreads(quantityOfThreads, n, null);
        System.out.println("quantityOfThreads=" + quantityOfThreads);
        findMaxDivider(quantityOfThreads);
    }

    public void findMaxDivider(int quantityOfThreads) {
        synchronized (locker) {
            try{
                for (int i = 0; i < quantityOfThreads; i++) {
                    locker.wait(1000);
                }
            } catch (InterruptedException e) {
            }

            Integer[] arrayDividers = listOfDividers.toArray(new Integer[listOfDividers.size()]);
            int max = Collections.max(listOfDividers);

            for (int i = 0; i < arrayDividers.length; i++) {
                if (arrayDividers[i] == max) {
                    listIndexMax.add(i);
                }
            }

            System.out.println("индексы: " + listIndexMax);
            System.out.println("делители: " + listOfDividers);
            System.out.println("result: ");

            int i;
            ListIterator<Integer> listIterator = listIndexMax.listIterator();
            while (listIterator.hasNext()) {
                i = listIterator.next();
                System.out.println("Число - " + (i + 1) + ", количество делителей - " + listOfDividers.get(i));
            }

            setEndTime();

            System.out.println(spendTime());
        }
    }
}
