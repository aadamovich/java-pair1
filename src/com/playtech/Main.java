package com.playtech;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Yeah!");
        ///
        System.out.println("Let's change things");

        List<Point> points = new ArrayList<Point>();

        points.add(new Point(12L, 14L));
        points.add(new Point(3L, 7L));
        points.add(new Point(15L, 4L));
        points.add(new Point(5L, 9L));
        points.add(new Point(5L, 5L));
        points.add(new Point(12L, 12L));

        Rectangle rectangle = new Rectangle(new Point(2L, 2L), new Point(2L, 4L), new Point(5L, 2L), new Point(5L, 4L));

        //List<Point> inRectagle = (List<Point>)
        points.stream().filter(p -> p.getX() > rectangle.getLeftBottom().getX()).filter(p -> p.getX() < rectangle.getLeftUpper().getX()).forEach(System.out::println);


    }
}
