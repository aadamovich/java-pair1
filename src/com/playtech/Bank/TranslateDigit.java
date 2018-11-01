package com.playtech.Bank;

import java.util.*;

public class TranslateDigit {

    public static int translateDigit(List<String> translate) {

        if(new ArrayList<String>((Arrays.asList(
                "   ",
                "  |",
                "  |",
                "   "
        ))).equals(translate)) return 1;

        else if(new ArrayList<String>((Arrays.asList(
                " _ ",
                " _|",
                "|_ ",
                "   "
        ))).equals(translate)) return 2;

        else if(new ArrayList<String>((Arrays.asList(
                " _ ",
                " _|",
                " _|",
                "   "
        ))).equals(translate)) return 3;

        else if(new ArrayList<String>((Arrays.asList(
                "   ",
                "|_|",
                "  |",
                "   "
        ))).equals(translate)) return 4;

        else if(new ArrayList<String>((Arrays.asList(
                " _ ",
                "|_ ",
                " _|",
                "   "
        ))).equals(translate)) return 5;

        else if(new ArrayList<String>((Arrays.asList(
                " _ ",
                "|_ ",
                "|_|",
                "   "
        ))).equals(translate)) return 6;

        else if(new ArrayList<String>((Arrays.asList(
                " _ ",
                "  |",
                "  |",
                "   "
        ))).equals(translate)) return 7;

        else if(new ArrayList<String>((Arrays.asList(
                " _ ",
                "|_|",
                "|_|",
                "   "
        ))).equals(translate)) return 8;

        else if(new ArrayList<String>((Arrays.asList(
                " _ ",
                "|_|",
                " _|",
                "   "
        ))).equals(translate)) return 9;

        else return 0;
    }
}
