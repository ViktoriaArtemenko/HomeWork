package com.company.main.threads1;

import java.util.TreeSet;

public class ClassMaxElement extends BaseClass {

    private int optimalNumbersInOneThread = 10;
    private int nRandom = 36;
    private int[] mas;
    private int n;

    private static TreeSet treeSet = new TreeSet();

    public void run(){

        setStartTime();

        n = random.nextInt(nRandom)+ 4;
        mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(nRandom);
        }
        printMas(mas);

        quantityOfThreads = optimalQuantityOfThreads(optimalNumbersInOneThread, mas.length);
        separationResourcesBetweenThreads(quantityOfThreads, mas.length, mas);
        System.out.println("quantityOfThreads=" + quantityOfThreads);
        findMaxElement(quantityOfThreads);
    }

    public void addElement(int element) {
        treeSet.add(element);
    }

    public void findMaxElement(int quantityOfThreads) {
        synchronized (locker) {
            try{
                for (int i = 0; i < quantityOfThreads; i++) {
                    locker.wait(1000);
                }
            } catch (InterruptedException e) {
            }
            System.out.println("Max element = " + treeSet.last());

            setEndTime();

            System.out.println(spendTime());
        }
    }
}