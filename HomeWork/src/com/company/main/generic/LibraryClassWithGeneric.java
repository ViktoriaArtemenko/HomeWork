package com.company.main.generic;

import java.util.HashMap;

public class LibraryClassWithGeneric<T> {

    private T key;

    private HashMap<String, String> book = new HashMap();
    private HashMap<Integer, String> video = new HashMap();
    private HashMap<Double, String> newspaper = new HashMap();

    public LibraryClassWithGeneric(T key) {
        this.key = key;

        book.put("Bulgakov", "My-my");
        book.put("Tolstoi", "Voina i mur");
        book.put("Dostoevskii", "Prestuplenie i nakazanie");
        book.put("Ekzuperi", "Malenkii Prinz");
        book.put("Shevchenko", "Haidamaki");

        video.put(12, "musically");
        video.put(158, "movie");
        video.put(7, "cartoon");
        video.put(45, "film");
        video.put(215, "serial");

        newspaper.put(56.87, "Asd");
        newspaper.put(10.0, "Gghh");
        newspaper.put(67.9, "Dub");
        newspaper.put(7.8, "Hjo");
        newspaper.put(14.8, "Dkjk");

    }

    public void printElement(LibraryClassWithGeneric<?> library, HashMap<?, String> hashMap) {
        if (hashMap.containsKey(library.key))
            System.out.println(library.getKey() + " - " + book.get(library.getKey()));
        else
            System.out.println("No such element! ");
    }

    public T getKey() {
        return key;
    }

    public HashMap<String, String> getBook() {
        return book;
    }

    public HashMap<Integer, String> getVideo() {
        return video;
    }

    public HashMap<Double, String> getNewspaper() {
        return newspaper;
    }
}
