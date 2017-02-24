package com.company.main.generic.library;

public class LibraryClassWithoutGenericVideo {

    private Video object;

    public LibraryClassWithoutGenericVideo(Video object) {
        this.object = object;
    }

    public void setName(String name) {
        object.name = name;
    }

    public String getName() {
        return object.name;
    }

}
