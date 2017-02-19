package com.company.main.generic;

public class ChangePositionClass<T> {

    public <T> void changePositionOfArray(int indexFirstElement, int indexLastElement, T[] mas) {
        T buf = mas[indexFirstElement];
        mas[indexFirstElement] = mas[indexLastElement];
        mas[indexLastElement] = buf;
    }
}
