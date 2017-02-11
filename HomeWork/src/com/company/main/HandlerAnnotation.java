package com.company.main;

import com.company.main.annotation.MyAnoMethod;
import com.company.main.annotation.MyaAnoClass;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HandlerAnnotation {

    public void checkAn(String nameClass) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> cl = Class.forName(nameClass);
        MyaAnoClass myaAnoClass = cl.getDeclaredAnnotation(MyaAnoClass.class);

        if (myaAnoClass == null) {
            return;
        }
        Annotation annotation;
        Method[] methods = cl.getDeclaredMethods();
        Object obj = cl.newInstance();

        for (Method m : methods) {
            annotation = m.getDeclaredAnnotation(MyAnoMethod.class);
            if (annotation != null) {
                m.setAccessible(true);
                m.invoke(obj);
            }
        }
    }
}
