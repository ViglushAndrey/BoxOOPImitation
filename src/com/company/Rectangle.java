package com.company;

/**
 * Created by IntelliJ IDEA.
 * BoxOOPImitation.Rectangle
 *
 * @Autor: Andrey
 * @DateTime: 01.10.2020|16:21
 * @Version: Rectangle: 1.0
 */
public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
    