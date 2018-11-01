package com.playtech.Bank;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static List<OCRNumber> OCRNumbers = new ArrayList<OCRNumber>();

    public static void main(String[] args) {

        //TODO Matrix for numbrs
        //TODO HashMap for numberMatrix vs number
        //TODO Recognize numbers
        //TODO Validate numbers
        //TODO Write to file

        List<String> lines = new ArrayList<>();
        int linecounter = 0;
        List<String> tempOCRNumberLines = new ArrayList<String>();


        try {
            lines = Files.lines(Paths.get("java-pair1/input.txt")).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println(e);
        }

        for (String line : lines) {
            linecounter++;
            //System.out.println("Test " + line);
            tempOCRNumberLines.add(line);

            if (linecounter % 4 == 0) {
                OCRNumber ocr = new OCRNumber(tempOCRNumberLines);
                OCRNumbers.add(ocr);
                linecounter = 0;
                tempOCRNumberLines.clear();
                //System.out.println(ocr.toString());
            }
        }

        System.out.println(OCRNumbers.toString());
    }



    public static void createHashmap(OCRNumber line) {
        System.out.println(line);
    }
}

