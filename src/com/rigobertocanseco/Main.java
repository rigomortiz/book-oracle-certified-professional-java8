package com.rigobertocanseco;

import com.rigobertocanseco.graphicshape.Canvas;
import com.rigobertocanseco.graphicshape.Circle;

public class Main {
    /*
    Encapsulate
    Access modifiers/ Within the    Subclass inside     Subclass outside        Other class inside      Other class outside
    accessibility  same class       the package         the package             the package             the package
    Public           Yes                 Yes                Yes                     Yes                     Yes
    Private          Yes                 No                 No                      No                      No
    Protected        Yes                 Yes                Yes                     Yes                     No
    Default          Yes                 Yes                No                      Yes                     No
     */
    public static void main(String[] args) {
	// write your code here
        Canvas canvas = new Canvas();
        Circle circle = new Circle();
        circle.getDefault();
    }
}
