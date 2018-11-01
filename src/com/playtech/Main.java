package com.playtech;

import java.util.ArrayList;
import java.util.Comparator;
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
        points.add(new Point(4L, 4L));
        points.add(new Point(3L, 3L));
        points.add(new Point(5L, 5L));
        points.add(new Point(12L, 12L));

        OurRectangle rectangle = new OurRectangle(new Point(2L, 2L), new Point(2L, 4L), new Point(5L, 2L), new Point(5L, 4L));


        System.out.println("Rectangle");
        //List<Point> inRectagle = (List<Point>)
        points.stream()
                .filter(p -> p.getX() > rectangle.getLeftBottom().getX())
                .filter(p -> p.getX() < rectangle.getRightUpper().getX())
                .filter(p -> p.getY() > rectangle.getLeftBottom().getY())
                .filter(p -> p.getY() < rectangle.getRightUpper().getY())
                .forEach(System.out::println);


        OurCircle circle = new OurCircle(new Point(4L,4L), 5);

        System.out.println("Circle");
        points.stream()
                .filter(p -> circle.getRadius()>p.distance(circle.getCenter()))
                .forEach(System.out::println);


        System.out.println("Sort by distance");

        Point punkt = new Point(5L,5L);


        Comparator<Point> c = (Point a, Point b) ->
                (int) Math.signum(a.distance(punkt) - b.distance(punkt));


        points.sort(c);
        points.sort((Point a, Point b) ->
                (int) Math.signum(a.distance(punkt) - b.distance(punkt)));



        for (Point p :
                points) {
            System.out.println(p);
        }


        int limit = 4;
        System.out.println("Print " + limit + " closest");
        points.stream()
                .limit(limit)
                .forEach(System.out::println);


    }
}
