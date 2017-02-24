package com.company.main.generic.library;

public class LibraryClassWithGeneric<T extends BaseClass> {

    private T object;

    public LibraryClassWithGeneric(T object) {
        this.object = object;
    }

    public void setName(String name) {
        object.name = name;
    }

    public String getName() {
        return object.name;
    }
}
