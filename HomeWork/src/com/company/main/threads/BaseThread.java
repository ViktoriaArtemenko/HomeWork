package com.company.main.threads;

public class BaseThread extends Thread{

    protected int start;
    protected int end;
    protected Object locker;

    public BaseThread(int start, int end, Object locker){
        this.start = start;
        this.end = end;
        this.locker = locker;
        start();
    }

}
