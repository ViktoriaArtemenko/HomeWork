package com.company.main.task;

import java.util.ArrayList;
import java.util.List;

public class TaskTwo {
    private int n = 8;
    private List<String> arrayList = new ArrayList();

    public List<String> getArrayList() {
        return arrayList;
    }

    public void method(String str) {
        String part;
        str = str.trim();

        int emptyIndex = str.indexOf(" ");
        if (emptyIndex == -1) {
            arrayList.add(str);
            return;
        }

        part = str.substring(0, str.indexOf(" "));

        if (part.length() >= n) {
            arrayList.add(part);
            str = str.substring(emptyIndex, str.length()).trim();
            method(str);
        } else {

            int index = 0;
            char[] chars = str.toCharArray();
            char[] currentChars = new char[n];
            for (int i = 0; i < n; i++) {
                currentChars[i] = chars[i];

                if (chars[i] == ' ') {
                    index = i;
                }
            }
            part = str.substring(0, index);
            arrayList.add(part);
            str = str.substring(index, str.length());
            method(str);
        }
    }
}


