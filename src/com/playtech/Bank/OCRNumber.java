package com.playtech.Bank;

import java.util.List;

public class OCRNumber {

    private List<OCRDigit> number;
    private boolean invalid = false;
    private boolean illegal = false;


    public OCRNumber(List<OCRDigit> number ) {

        this.number = number;
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
}
