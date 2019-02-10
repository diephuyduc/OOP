/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan4;

/**
 *
 * @author Huy Duc
 */
import java.util.Random;
import java.util.Scanner;
public class NewClass {
    public static void main(String args []){
        int i=1, j, t, guess, help, check=0;
        Random rd = new Random();
        Scanner scan = new Scanner(System.in);
        j=rd.nextInt(101);
        
        //System.out.print(j);
        System.out.print("Enter number you guess: ");
        System.out.println("\nHelp will be incorrect in [0, Absolute(Answer - Your Guess + random [0, 10])]");
        while(i<=10){
            t=0;
            t= rd.nextInt(10);
            
           guess= scan.nextInt();
           help= Math.abs(j-guess+ t);
           
            if(guess==j){
                System.out.println("You are win. Amazing!");
                check=1;
                break;
             }
            else if(guess <j){ System.out.println("Enter a bigger number. Help: +[0, "+ help+"]");
            
            
           }
            else {
                    System.out.println("Enter a smaller  number. Help: -[0, "+ help+"]");
                    }
             i++;
        }
        if(check!=1){System.out.print("You are loss.\n The Answer is: "+ j);}
        
    }
}
