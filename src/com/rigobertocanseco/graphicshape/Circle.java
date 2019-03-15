package com.rigobertocanseco.graphicshape;

public class Circle extends Shape {
    private int radius;
    public void area (){
        System.out.println("Area:" + 3.1416 * radius*radius);
    }

    void fillColor(){
        System.out.print("Color:" + color);
    }

    public int getDefault(){
        return default_;
    }
}
