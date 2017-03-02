package com.company.main;

import java.util.Observable;
import java.util.Observer;

public class Display implements Observer{

    private Arena arena;

    public Display(Arena arena) {
        this.arena = arena;
        arena.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println(arena.getResult());
    }
}
