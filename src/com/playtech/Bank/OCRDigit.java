package com.playtech.Bank;

import java.util.List;

public class OCRDigit {

    private List<String> OcrDigit;

    public OCRDigit(List<String> ocrDigit) {
        OcrDigit = ocrDigit;
    }

    public List<String> getOcrDigit() {
        return OcrDigit;
    }

    @Override
    public String toString() {
        return "OCRDigit{" +
                "OcrDigit=" + OcrDigit +
                '}';
    }
}
