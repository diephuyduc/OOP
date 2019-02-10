/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.awt.Point;
import java.util.ArrayList;


/**
 *
 * @author Huy Duc
 */
public class main {
    public static void main(String[] args) {
        Shape circle = new Circle(50, 50, 20);
    Point point1 = new Point(100,100);
    Point point2 = new Point(100,75);
    Point point3 = new Point(75,100);
    Shape  trigangle= new Trigangle(point1, point2, point3);
    
    ArrayList<Shape> shapes = new ArrayList<>();
    shapes.add(circle);
    shapes.add(trigangle);
    
    
    ArrayList<Layer>layers = new ArrayList<>();
    layers.add(new Layer(shapes));
    
    Diagram panel =new Diagram(layers);
    for(int i =0;i <layers.size();i++)
    {
        layers.get(i).RemoveTriangle();
    }
    
    panel.RemoveCircle();
    

    }
    
    
    
}
