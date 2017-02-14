package com.company.main.main;

import com.company.main.TaskOne;
import com.company.main.TaskThree;
import com.company.main.TaskTwo;

public class Main {
    private static String str1 = "Care       killed   the   cat";
    private static String str2 = "A bird in the hand is worth 6646 two in the bush.";
    private static String word = "Комок";

    public static void main(String[] args) {

        System.out.println();
        TaskOne taskOne = new TaskOne();
        taskOne.method(str1);
        System.out.println();

        TaskTwo taskTwo = new TaskTwo();
        taskTwo.method(str2);
        System.out.println(taskTwo.getArrayList());

        TaskThree taskThree = new TaskThree();
        System.out.println();
        taskThree.method(word);
    }
}
