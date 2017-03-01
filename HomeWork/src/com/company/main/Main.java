package com.company.main;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class Main {

    private static final double PROBABILITY_DOCTOR = 0.2;
    private static final double PROBABILITY_VISITOR = 0.5;
    private static final int QUANTITY_OF_ROOMS = 4;
    private static Room room;

    private static ArrayList<Room> arrayListOfRooms = new ArrayList();

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start");
        Random r = new Random();

        for (int i = 1; i <= QUANTITY_OF_ROOMS; i++) {
            room = new Room(i);
            new Display(room);
            arrayListOfRooms.add(room);
        }

        ListIterator<Room> listIterator;

        while (true) {

            listIterator = arrayListOfRooms.listIterator();
            if (r.nextDouble() < PROBABILITY_VISITOR) {
                while (listIterator.hasNext()) {
                    room = listIterator.next();
                    new Visitor(room).start();
                }
            }

            listIterator = arrayListOfRooms.listIterator();
            if (r.nextDouble() < PROBABILITY_DOCTOR) {
                while (listIterator.hasNext()) {
                    room = listIterator.next();
                    new Doctor(room).start();
                }
            }
            Thread.sleep(200);
        }
    }
}