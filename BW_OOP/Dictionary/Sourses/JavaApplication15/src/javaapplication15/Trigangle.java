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
public class Trigangle extends Shape{
    private Point point1;
    private Point point2;
    private Point point3;

    public Trigangle() {
    }

    public Trigangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }
    public void updateLocaltion(Point vt)
   {
       point1.x =point1.x +vt.x;
       point1.y =point1.y +vt.y;
       
       point2.x =point1.x +vt.x;
       point2.y =point1.y +vt.y;
       
       point3.x =point1.x +vt.x;
       point3.y =point1.y +vt.y;
      
       
   }
    
}
