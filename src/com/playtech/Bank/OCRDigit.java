package com.playtech.Bank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class OCRDigit {

  private List<String> digitData;

  OCRDigit(List<String> ocrDigit) {
    this.digitData = ocrDigit;
  }

  @Override
  public String toString() {
    return digitData
        .stream()
        .collect(joining("\n"));
  }

  public char translateDigit() {

    if (new ArrayList<String>((Arrays.asList(
        "   ",
        "  |",
        "  |",
        "   "
    ))).equals(digitData)) return '1';

    else if (new ArrayList<String>((Arrays.asList(
        " _ ",
        " _|",
        "|_ ",
        "   "
    ))).equals(digitData)) return '2';

    else if (new ArrayList<String>((Arrays.asList(
        " _ ",
        " _|",
        " _|",
        "   "
    ))).equals(digitData)) return '3';

    else if (new ArrayList<String>((Arrays.asList(
        "   ",
        "|_|",
        "  |",
        "   "
    ))).equals(digitData)) return '4';

    else if (new ArrayList<String>((Arrays.asList(
        " _ ",
        "|_ ",
        " _|",
        "   "
    ))).equals(digitData)) return '5';

    else if (new ArrayList<String>((Arrays.asList(
        " _ ",
        "|_ ",
        "|_|",
        "   "
    ))).equals(digitData)) return '6';

    else if (new ArrayList<String>((Arrays.asList(
        " _ ",
        "  |",
        "  |",
        "   "
    ))).equals(digitData)) return '7';

    else if (new ArrayList<String>((Arrays.asList(
        " _ ",
        "|_|",
        "|_|",
        "   "
    ))).equals(digitData)) return '8';

    else if (new ArrayList<String>((Arrays.asList(
        " _ ",
        "|_|",
        " _|",
        "   "
    ))).equals(digitData)) return '9';

    else return 0;

  }

}
