package com.company.main.main;

import com.company.main.threads.ClassMaxDivider;
import com.company.main.threads.ClassMaxElement;

public class Main {

    public static void main(String[] args) {

        new ClassMaxElement().run();

        System.out.println("**********************************");

        new ClassMaxDivider().run();
    }
}
