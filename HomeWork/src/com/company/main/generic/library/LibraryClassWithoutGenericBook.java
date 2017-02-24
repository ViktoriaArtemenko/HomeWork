package com.company.main.generic.library;

public class LibraryClassWithoutGenericBook {

    private Book object;

    public LibraryClassWithoutGenericBook(Book object) {
        this.object = object;
    }

    public void setName(String name) {
        object.name = name;
    }

    public String getName() {
        return object.name;
    }

}
