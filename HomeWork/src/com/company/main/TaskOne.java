package com.company.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskOne {

    public void method(String str) {
        Pattern pattern = Pattern.compile("[ ]+");
        Matcher matcher = pattern.matcher(str);
        str = matcher.replaceAll(" ");
        System.out.println(str);
    }
}
