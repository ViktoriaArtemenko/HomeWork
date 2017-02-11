package com.company.main;

public class TaskThree {

    public void method(String word) {
        if (word.length() != 5) {
            System.out.println("Нужно ввести слово, которое состоит из 5 букв.");
            return;
        }
        StringBuilder reversWord = new StringBuilder(word);
        reversWord = reversWord.reverse();
        if (word.equalsIgnoreCase(reversWord.toString()))
            System.out.println("Слово " + word + " является палиндромом");
        else System.out.println("Слово " + word + " не является палиндромом");
    }
}
