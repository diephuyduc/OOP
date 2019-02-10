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
public class Diagram {
    private ArrayList<Layer> layer;

    public ArrayList<Layer> getLayer() {
        return layer;
    }

    public void setLayer(ArrayList<Layer> layer) {
        this.layer = layer;
    }

    public Diagram(ArrayList<Layer> layer) {
        this.layer = layer;
    }
    public void RemoveCircle()
    {
        
         for(int i =0; i < layer.size(); i++)
        {
           ArrayList<Shape> shape =layer.get(i).getShapes();
           for(int j = 0;j<shape.size(); j++ )
           {
               shape.remove(j);
           }
        }
    }
}
