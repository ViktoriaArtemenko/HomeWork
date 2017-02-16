package com.company.main.main;

import com.company.main.constants.Constants;
import com.company.main.task.TaskOne;
import com.company.main.task.TaskThree;
import com.company.main.task.TaskTwo;

import java.util.*;

public class Main {

    public static ArrayList<String> arrayListStr1 = new ArrayList();
    public static ArrayList<String> arrayListStr2 = new ArrayList();

    public static ArrayList<Integer> arrayListInt1 = new ArrayList();
    public static ArrayList<Integer> arrayListInt2 = new ArrayList();

    public static void main(String[] args) {
        arrayListStr1.add("str1");
        arrayListStr1.add("str2");
        arrayListStr1.add("str3");

        copy(arrayListStr1, arrayListStr2);

        System.out.println(arrayListStr1);
        System.out.println(arrayListStr2);

        System.out.println();

        arrayListInt1.add(1);
        arrayListInt1.add(2);
        arrayListInt1.add(3);

        copy(arrayListInt1, arrayListInt2);

        System.out.println(arrayListInt1);
        System.out.println(arrayListInt2);

        //task();
    }

    public static <T>void copy(List<T> fromArrayList, List<T> toArrayList) {
        ListIterator<T> listIterator = fromArrayList.listIterator();
        while(listIterator.hasNext()){
            toArrayList.add(listIterator.next());
        }
    }

    public static void task() {
        System.out.println();
        TaskOne taskOne = new TaskOne();
        taskOne.method(Constants.STR_1);
        System.out.println();

        TaskTwo taskTwo = new TaskTwo();
        taskTwo.method(Constants.STR_2);
        System.out.println(taskTwo.getArrayList());

        TaskThree taskThree = new TaskThree();
        System.out.println();
        taskThree.method(Constants.WORD);
    }
}
