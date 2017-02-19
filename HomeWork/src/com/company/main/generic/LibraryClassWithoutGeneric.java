package com.company.main.generic;

import java.util.HashMap;

public class LibraryClassWithoutGeneric {

    private HashMap<String, String> book = new HashMap();
    private HashMap<Integer, String> video = new HashMap();
    private HashMap<Double, String> newspaper = new HashMap();

    public LibraryClassWithoutGeneric() {

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

    public void printElement(Double key, HashMap<Double, String> hashMap) {
        if (hashMap.containsKey(key))
            System.out.println(key + " - " + hashMap.get(key));
        else
            System.out.println("No such element! ");
    }

    public void printElement(Integer key, HashMap<Integer, String> hashMap) {
        if (hashMap.containsKey(key))
            System.out.println(key + " - " + hashMap.get(key));
        else
            System.out.println("No such element! ");
    }

    public void printElement(String key, HashMap<String, String> hashMap) {
        if (hashMap.containsKey(key))
            System.out.println(key + " - " + hashMap.get(key));
        else
            System.out.println("No such element! ");
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
