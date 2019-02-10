/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.ArrayList;

/**
 *
 * @author Huy Duc
 */
public class Layer {
    private ArrayList<Shape> shapes;

    public Layer(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }
    public void RemoveTriangle()
    {
        for(int i =0; i < shapes.size(); i++)
        {
            if(shapes.get(i) instanceof Trigangle)
            {
                shapes.remove(i);
            }
        }
    }
}
