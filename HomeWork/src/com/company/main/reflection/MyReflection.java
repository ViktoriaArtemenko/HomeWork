package com.company.main.reflection;

import com.company.main.annotation.MyAnoMethod;
import com.company.main.annotation.MyAnoClass;

@MyAnoClass
public class MyReflection {

    @MyAnoMethod
    private void runtime() {
        System.out.println("Это метод запускаестся с помощью аннотации.");
    }
}
