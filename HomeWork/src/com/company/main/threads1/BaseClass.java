package com.company.main.threads1;

import java.util.Calendar;
import java.util.Random;

public class BaseClass {

    protected int secondStart;
    protected int secondEnd;

    private int secondDelta;

    protected int quantityOfThreads;
    protected int nOneThread;

    protected Random random = new Random();
    protected Object locker = new Object();

    protected Calendar calendar;

    protected String spendTime() {
        String time;

        if (secondEnd < secondStart) {
            secondDelta = (60 - secondStart) + secondEnd;
        } else {
            secondDelta = secondEnd - secondStart;
        }

        System.out.println("start: " + secondStart);
        System.out.println("end: " + secondEnd);
        System.out.println("delta: " + secondDelta);

        time = "Прошло времени " + secondDelta + " сек";
        return time;
    }

    protected static void printMas(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println();
    }

    protected void separationResourcesBetweenThreads(int quantityOfThreads, int n, int... mas) {
        nOneThread = n / quantityOfThreads;
        int start = 0;
        int end = nOneThread;

        if (mas != null) new ThreadMaxElement(start, end, mas, locker);
        if (mas == null) new ThreadMaxDivider(start, end, locker);

        if (quantityOfThreads == 1) return;

        for (int i = 0; i < quantityOfThreads - 1; i++) {
            start = end;
            if (i == quantityOfThreads - 2) {
                end = n;
            } else {
                end = (nOneThread * (i + 2));
            }
            if (mas != null) new ThreadMaxElement(start, end, mas, locker);
            if (mas == null) new ThreadMaxDivider(start, end, locker);
        }
    }

    protected int optimalQuantityOfThreads(int optimalNumbersInOneThread, int n) {
        int nThreads = n / optimalNumbersInOneThread;
        if (nThreads <= 1) return 1;
        return nThreads;
    }

    protected void setStartTime() {
        calendar = Calendar.getInstance();
        secondStart = calendar.get(Calendar.SECOND);
    }

    protected void setEndTime() {
        calendar = Calendar.getInstance();
        secondEnd = calendar.get(Calendar.SECOND);
    }
}