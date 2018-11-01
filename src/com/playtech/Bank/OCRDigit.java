package com.playtech.Bank;

import java.util.ArrayList;
import java.util.List;

public class OCRDigit {

    private List<String> OcrDigit = new ArrayList<String>();



    public OCRDigit(List<String> ocrDigit) {
        OcrDigit = ocrDigit;

    }

    public List<String> getOcrDigit() {
        return OcrDigit;
    }


    @Override
    public String toString() {
        String out = "\n";
        for (String line :
                OcrDigit) {
            out = out + line + "\n";
        }
        return out;
    }
}
