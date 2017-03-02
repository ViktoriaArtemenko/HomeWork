package com.company.main.threads1;

public class ThreadMaxElement extends BaseThread {

    private int[] mas;

    public ThreadMaxElement(int start, int end, int[] mas, Object locker) {
        super(start, end, locker);
        this.mas = mas;
    }

    @Override
    public void run() {
        if (mas == null) return;
        int max = 0;

        synchronized (locker) {
            for (int i = start; i < end; i++) {
                if (mas[i] > max) max = mas[i];
            }
            new ClassMaxElement().addElement(max);
            locker.notify();
        }
    }
}