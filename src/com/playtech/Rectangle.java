package com.playtech;

import java.util.ArrayList;
import java.util.List;

public class Rectangle {

    private Point leftBottom;
    private Point leftUpper;
    private Point rightBottom;
    private Point rightUpper;

    public Rectangle(Point leftBottom, Point leftUpper, Point rightBottom, Point rightUpper) {
        this.leftBottom = leftBottom;
        this.leftUpper = leftUpper;
        this.rightBottom = rightBottom;
        this.rightUpper = rightUpper;
    }

    public Point getLeftBottom() {
        return leftBottom;
    }

    public Point getLeftUpper() {
        return leftUpper;
    }

    public Point getRightBottom() {
        return rightBottom;
    }

    public Point getRightUpper() {
        return rightUpper;
    }
}
