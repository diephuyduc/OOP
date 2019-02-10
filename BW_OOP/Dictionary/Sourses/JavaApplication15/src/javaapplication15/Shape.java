/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.awt.Point;

/**
 *
 * @author Huy Duc
 */
abstract class Shape {
    private String color;
    private boolean fill;
    private Point vt;

    public Point getVt() {
        return vt;
    }

    public void setVt(Point vt) {
        this.vt = vt;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }
    abstract public void updateLocaltion(Point vt);
    
}
