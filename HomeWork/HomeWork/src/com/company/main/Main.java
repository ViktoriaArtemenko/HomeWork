package com.company.main;

public class Main {

    private static String[] surname = {"Leblanc", "Sartorius", "Rockelle", "Mackenzie", "Grande", "Bratayley",
            "Grace", "Orlando", "Hancher", "Gomez"};
    private static String[] name = {"Annie", "Jacob", "Piper", "Ziegler", "Hayley", "Annie", "Hayley", "Lauren",
            "Kristen", "Johnny"};
    private static String[] birthday = {"11.06.2004", "12.11.2004", "13.01.2004", "14.07.2004", "06.06.2004",
            "16.05.2004", "17.07.2004", "18.09.2004", "19.07.2004", "20.08.2004"};

    private static String nameSurname = "Annie Leblanc";
    private static int n;

    public static void main(String[] args) {

        Dictionary dictionaryOne = new Dictionary();
        dictionaryOne.initDictionary(surname, name);

        Dictionary dictionaryTwo = new Dictionary();
        dictionaryTwo.initDictionary(surname, birthday);

        dictionaryOne.printDictionary();
        dictionaryTwo.printDictionary();

        n = dictionaryOne.searchCoincidence(nameSurname);
        dictionaryTwo.deleteBirthdaySummer();

        System.out.println();

        System.out.println(nameSurname + ": " + n + " совпадений.");
        dictionaryTwo.printDictionary();
    }
}
