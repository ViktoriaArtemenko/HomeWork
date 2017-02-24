package com.company.main.generic.library;

public class LibraryClassWithoutGenericNewspaper {

    private Newspaper object;

    public LibraryClassWithoutGenericNewspaper(Newspaper object) {
        this.object = object;
    }

    public void setName(String name) {
        object.name = name;
    }

    public String getName() {
        return object.name;
    }
}

