/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan5;

/**
 *
 * @author Huy Duc
 */

public class abc {
    
}
class Shape{
//    Color:String = "Read";
//    filled:boolean = true;
    private String color = "red";
    private boolean filled = true;
    Shape(){
        
    }
    String getColor(){
        return color;
        
    }
    void setColor(String color){
        this.color= color;
    }
    boolean isFilled(){
        return filled;
    }
 void   setFilled(boolean filled){
     this.filled = filled;
 }
 
   
}
class Circle extends Shape{
    Circle(){
        
    }
    Circle(float radius, String color, boolean filled){
        
    }
}
