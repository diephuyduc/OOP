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
public class Rectangle extends Shape{
    private int x_top_left;
    private int y_top_left;
    private int width;
    private int height;

    public Rectangle(int x_top_left, int y_top_left, int width, int height) {
        this.x_top_left = x_top_left;
        this.y_top_left = y_top_left;
        this.width = width;
        this.height = height;
    }
    

    public int getX_top_left() {
        return x_top_left;
    }

    public void setX_top_left(int x_top_left) {
        this.x_top_left = x_top_left;
    }

    public int getY_top_left() {
        return y_top_left;
    }

    public void setY_top_left(int y_top_left) {
        this.y_top_left = y_top_left;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    @Override
    public void updateLocaltion(Point vt)
   {
       setX_top_left(getX_top_left()+vt.x);
       setY_top_left(getY_top_left()+vt.y);
   }
    
}
