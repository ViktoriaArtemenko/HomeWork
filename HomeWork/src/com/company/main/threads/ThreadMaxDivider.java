package com.company.main.threads;

import com.company.main.threads.BaseThread;
import com.company.main.threads.ClassMaxDivider;

import java.util.LinkedList;

public class ThreadMaxDivider extends BaseThread {

    private int res;
    private int count;
    private LinkedList<Integer> listOfDividers = new LinkedList();

    private ClassMaxDivider classMaxDivider = new ClassMaxDivider();

    public ThreadMaxDivider(int start, int end, Object locker) {
        super(start, end, locker);
    }

    @Override
    public void run() {
        synchronized (locker) {

            for (int i = (start + 1); i <= end; i++) {
                count = 0;
                for (int j = 1; j <= i; j++) {
                    res = i % j;
                    if (res == 0) {
                        count++;
                    }
                }
                listOfDividers.add(count);
                classMaxDivider.addElementDividers(count);
            }

            locker.notify();
        }
    }
}
