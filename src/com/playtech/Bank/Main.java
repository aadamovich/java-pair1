package com.playtech.Bank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.nio.file.Files.lines;
import static java.nio.file.Paths.get;
import static java.util.stream.Collectors.toList;

public class Main {

  private static List<OCRNumber> OCRNumbers = new ArrayList<>();

  public static void main(String[] args) throws IOException {

    //TODO Matrix for numbrs
    //TODO HashMap for numberMatrix vs number
    //TODO Recognize numbers
    //TODO Validate numbers
    //TODO Write to file


    List<String> lines = lines(get("java-pair1/input.txt")).collect(toList());
    List<String> tempOCRNumberLines = new ArrayList<>();
    for (int lineIndex = 0; lineIndex < lines.size(); lineIndex++) {
      tempOCRNumberLines.add(lines.get(lineIndex));
      if ((lineIndex + 1) % 4 == 0) {
        OCRNumbers.add(new OCRNumber(tempOCRNumberLines));
        tempOCRNumberLines.clear();
      }
    }

    System.out.println(OCRNumbers.toString());

  }

  public static void createHashmap(OCRNumber line) {
    System.out.println(line);
  }
}

