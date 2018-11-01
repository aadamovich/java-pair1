package com.playtech.Bank;

import java.util.List;
import java.util.stream.Collectors;

public class OCRNumber {

    private List<OCRDigit> number;
    private boolean invalid = false;
    private boolean illegal = false;
    private int translated ;


    public OCRNumber(List<String> lines) {

        String[] a = new String[3];
        for (int i = 0; i < 9; i++) {
            number.add(new OCRDigit(lines.stream()
                    .limit(3 * i + 3)
                    .skip(3 * i)
                    .collect(Collectors.toList())));
        }
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
                "number=" + number +
                '}';
    }
}
