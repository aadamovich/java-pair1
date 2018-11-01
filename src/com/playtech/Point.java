package com.playtech;

public class Point {

    public Point(Long x, Long y) {
        this.x = x;
        this.y = y;
    }

    private Long x;
    private Long y;

    public Long getX() {
        return x;
    }

    public Long getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
