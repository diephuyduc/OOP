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
public class fibonaci {
    public static int f (int n){
        if(n==0) return 0;
        if(n==1) return 1;
        
        return f(n-1)+ f(n-2);
    }
    public static void main(String [] args){
        int n, i;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(i=0; i<=n; i++){
            System.out.printf("%d ",f(i));
        }
        
    }
}

