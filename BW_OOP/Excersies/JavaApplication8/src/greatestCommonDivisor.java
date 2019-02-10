/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Huy Duc
 */
import java.util.Scanner;
public class greatestCommonDivisor {
    
    public static int GCD(int a, int b){
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==b) return a;
        if(a>b) a=a-b;
        else b=b-a;
        return GCD(a, b);
    }
    public static void main(String [] args){
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        a=scan.nextInt();
        System.out.print("Enter number 2: ");
        b=scan.nextInt();
        System.out.println("Greatest Common Divisor: "+GCD(a, b));
        
    }
    
}
