package com.company.main.reflection;

import com.company.main.annotation.MyAnoMethod;
import com.company.main.annotation.MyAnoClass;

@MyAnoClass
public class ReflectionOne {

    @MyAnoMethod
    private void run() {
        System.out.println("Это метод запускаестся с помощью аннотации. ReflectionOne");
    }
}
