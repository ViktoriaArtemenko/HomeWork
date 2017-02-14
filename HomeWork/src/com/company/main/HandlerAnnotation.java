package com.company.main;

import com.company.main.annotation.MyAnoMethod;
import com.company.main.annotation.MyAnoClass;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

@SupportedAnnotationTypes("com.company.main.annotation.MyAnoClass")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class HandlerAnnotation extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        if ( annotations == null || annotations.isEmpty()) {
            return false;
        }

        for (Element e : roundEnv.getElementsAnnotatedWith(MyAnoClass.class)) {
            MyAnoClass an = e.getAnnotation(MyAnoClass.class);
            Class<?> cl = an.getClass();
            Annotation annotation;
            Method[] methods = cl.getDeclaredMethods();
            Object obj = null;
            try {
                obj = cl.newInstance();
            } catch (InstantiationException e1) {
                e1.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }

            for (Method m : methods) {
                annotation = m.getDeclaredAnnotation(MyAnoMethod.class);
                if (annotation != null) {
                    m.setAccessible(true);
                    try {
                        m.invoke(obj);
                    } catch (IllegalAccessException e1) {
                        e1.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        return true;
    }
}
