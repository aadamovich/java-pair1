package com.playtech.Bank;

import java.util.ArrayList;
import java.util.List;

public class OCRNumber {

    private List<OCRDigit> number = new ArrayList<OCRDigit>();
    private boolean invalid = false;
    private boolean illegal = false;
    private int translated;


    public OCRNumber(List<String> lines) {
        StringBuilder translation = new StringBuilder();
        for (int k = 0; k < 9; k++) {
            int j = 0;
            List<String> temp = new ArrayList<>();
            for (String line :
                    lines) {
                //System.out.println( "<<" + line.substring(k*3,k*3+3) + ">>");
                temp.add(line.substring(k * 3, k * 3 + 3));
                j++;
            }
            OCRDigit tempDigit = new OCRDigit(temp);
            number.add(tempDigit);
            //System.out.println("Tõlgib numbri" + TranslateDigit.translateDigit(temp));
            translation.append(TranslateDigit.translateDigit(temp));
        }
        translated = Integer.parseInt(translation.toString());
        //System.out.println("Peaks olema 123456789 -> " + translated);
    }


    public boolean isInvalid() {
        return invalid;
    }

    public boolean isIllegal() {
        return illegal;
    }

    public List<OCRDigit> getNumber() {
        return number;
    }

    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
    }

    public void setIllegal(boolean illegal) {
        this.illegal = illegal;
    }

    @Override
    public String toString() {
        return "OCRNumber{" +
                //"number=" + number +
                ", invalid=" + invalid +
                ", illegal=" + illegal +
                ", translated=" + translated +
                "}\n";
    }
}
