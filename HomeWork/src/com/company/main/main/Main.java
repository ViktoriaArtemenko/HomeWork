package com.company.main.main;

import com.company.main.HandlerAnnotation;
import com.company.main.TaskOne;
import com.company.main.TaskThree;
import com.company.main.TaskTwo;

import java.lang.reflect.InvocationTargetException;

public class Main {
    private static String str1 = "Care       killed   the   cat";
    private static String str2 = "A bird in the hand is worth 6646 two in the bush.";
    private static String word = "Комок";
    private static String nameClass1 = "com.company.main.reflection.MyReflection";
    private static String nameClass2 = "com.company.main.reflection.ReflectionOne";

    public static void main(String[] args) {
        HandlerAnnotation handlerAnnotation = new HandlerAnnotation();
        try {
            handlerAnnotation.checkAn(nameClass1);
            handlerAnnotation.checkAn(nameClass2);
        } catch (ClassNotFoundException e) {
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e) {
        } catch (InstantiationException e) {
        } catch (InvocationTargetException e) {
        }

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
