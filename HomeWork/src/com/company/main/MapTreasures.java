package com.company.main;

public class MapTreasures {
    String result;
    int x = 0;
    int y = 0;

    private String map = "North 5, West 12, South 9, East 14, North 7, West 8, South 20, " +
            "East 14, North 16, West 4, South 3, East 11";

    public String getCoordinates() {
        result = "[" + x + "," + y + "]";
        return result;
    }

    public void computeCoordinates() {
        String[] strCord = map.split(",");
        String[] mas;
        for (int i = 0; i < strCord.length; i++) {
            strCord[i] = strCord[i].trim();
            mas = strCord[i].split(" ");
            switch (mas[0]) {
                case "North":
                    y = y + Integer.parseInt(mas[1]);
                    break;
                case "West":
                    x = x - Integer.parseInt(mas[1]);
                    break;
                case "East":
                    x = x + Integer.parseInt(mas[1]);
                    break;
                case "South":
                    y = y - Integer.parseInt(mas[1]);
                    break;
                default:
                    break;

            }
        }
    }
}
