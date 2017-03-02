package com.company.main;

import java.util.LinkedList;
import java.util.Random;

public class Main {

    private static final int QUANTITY_OF_FIGHTERS = 100;
    private static Random random = new Random();
    private static Fighter fighter;
    private static Arena arena;
    private static LinkedList<Fighter> linkedList = new LinkedList();
    private static int count;

    public static void main(String[] args) {
        System.out.println("Start");

        arena = new Arena();
        new Display(arena);

        for (int i = 1; i <= QUANTITY_OF_FIGHTERS; i++) {
            initFighter(i);
            linkedList.add(fighter);
        }

        run();
    }

    public static void run() {
        synchronized (arena) {
            boolean flag = true;
            while (flag)
                count = 0;
            for (int i = 0; i < linkedList.size(); i++) {
                if (linkedList.get(i).getEndurance() <= 0) continue;
                for (int j = 0; j < linkedList.size(); j++) {
                    if (i == j || linkedList.get(j).getEndurance() <= 0) continue;
                    try {
                        arena.wait(1000);
                        arena.wait(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    arena.battle(linkedList.get(i), linkedList.get(j));
                    arena.notifyDisplay();
                }
                if (linkedList.get(i).getEndurance() > 0) {
                    count++;
                }
                if (count == 1) flag = false;
            }
        }
    }

    public static void initFighter(int number) {
        double sumStrengthIntuitionDexterity = 50;

        int strength = random.nextInt(100);
        int intuition = random.nextInt(100);
        int dexterity = random.nextInt(100);

        double index = sumStrengthIntuitionDexterity / (strength + intuition + dexterity);

        strength = (int) Math.round(strength * index);
        intuition = (int) Math.round(intuition * index);
        dexterity = (int) Math.round(dexterity * index);

        fighter = new Fighter(strength, intuition, dexterity, number, arena);
    }
}