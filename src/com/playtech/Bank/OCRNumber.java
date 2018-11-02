package com.playtech.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.String.valueOf;
import static java.util.stream.Collectors.joining;

public class OCRNumber {

  private List<OCRDigit> number = new ArrayList<>();
  private boolean illegal = false;

  OCRNumber(List<String> lines) {
    for (int k = 0; k < 9; k++) {
      List<String> digitData = new ArrayList<>();
      for (String line : lines) {
        digitData.add(line.substring(k * 3, k * 3 + 3));
      }
      OCRDigit digit = new OCRDigit(digitData);
      number.add(digit);
    }
  }

  public String translateNumber() {
    return number
        .stream()
        .map(digit -> valueOf(digit.translateDigit()))
        .collect(joining());
  }

  public boolean isInvalid() {
    return translateNumber().contains("?");
  }

  public boolean isIllegal() {
    return illegal;
  }

  @Override
  public String toString() {
    return "OCRNumber{" +
        "number=" + number
         .stream()
         .map(OCRDigit::toString)
         .collect(joining("")) +
        "translation=" + translateNumber() +
        "}\n";
  }

}
