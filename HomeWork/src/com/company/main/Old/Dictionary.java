package com.company.main.Old;

import java.util.*;

public class Dictionary {
    private Map<String, String> dictionary = new LinkedHashMap();

    public void initDictionary(String[] surname, String[] nameOrBirthday) {
        for (int i = 0; i < surname.length; i++) {
            dictionary.put(surname[i], nameOrBirthday[i]);
        }
    }

    public void printDictionary() {
        System.out.println(dictionary);
    }

    public int searchCoincidence(String nameSurname) {
        int count = 0;
        String str1, str2;
        StringTokenizer stringTokenizer = new StringTokenizer(nameSurname);
        String name = stringTokenizer.nextToken();
        String surname = stringTokenizer.nextToken();
        Iterator<String> iteratorSurname = dictionary.keySet().iterator();
        Iterator<String> iteratorName = dictionary.values().iterator();
        while (iteratorName.hasNext()) {
            str1 = iteratorName.next();
            str2 = iteratorSurname.next();
            if (str1.equals(name) || str2.equals(surname))
                count++;
        }
        return count;
    }

    public void deleteBirthdaySummer() {
        ArrayList<String> arrayListKey = searchBirthdaySummer();
        ListIterator<String> listIterator = arrayListKey.listIterator();
        String str;

        while (listIterator.hasNext()) {
            str = listIterator.next();
            dictionary.remove(str);
        }
    }

    public ArrayList<String> searchBirthdaySummer() {
        ArrayList<String> arrayListKey = new ArrayList();
        String surname, month, birthday;
        StringTokenizer stringTokenizer;
        Iterator<String> iteratorSurname = dictionary.keySet().iterator();
        Iterator<String> iteratorBirthday = dictionary.values().iterator();

        while (iteratorSurname.hasNext()) {
            surname = iteratorSurname.next();
            birthday = iteratorBirthday.next();
            stringTokenizer = new StringTokenizer(birthday, ".");
            stringTokenizer.nextToken();
            month = stringTokenizer.nextToken();
            if (month.equals("06") || month.equals("07") || month.equals("08"))
                arrayListKey.add(surname);
        }
        return arrayListKey;
    }
}
