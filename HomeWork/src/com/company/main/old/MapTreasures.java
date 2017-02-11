package com.company.main.old;

public class MapTreasures {
    private enum Side {North, West, South, East}

    private String map = "North 5, West 12, South 9, East 14, North 7, West 8, South 20, " +
            "East 14, North 16, West 4, South 3, East 11";

    private int x = 0;
    private int y = 0;

    private Side side;
    private String result;


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
            side = Side.valueOf(mas[0]);
            switch (side) {
                case North:
                    y = y + Integer.parseInt(mas[1]);
                    break;
                case West:
                    x = x - Integer.parseInt(mas[1]);
                    break;
                case East:
                    x = x + Integer.parseInt(mas[1]);
                    break;
                case South:
                    y = y - Integer.parseInt(mas[1]);
                    break;
                default:
                    break;
            }
        }
    }
}
