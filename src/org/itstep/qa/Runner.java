package org.itstep.qa;

public class Runner {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        double square = circle.getSquare();
        System.out.println("Square = " + square);
    }
}

