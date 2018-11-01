package com.playtech.Bank;

public class OCRDigit {

    private String [][] ocrN= new String [3][4];

    public OCRDigit(String[][] ocrN) {
        this.ocrN = ocrN;
    }

    public String[][] getOcrN() {
        return ocrN;
    }
}
