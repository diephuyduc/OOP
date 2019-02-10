/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Huy Duc
 */
import java.io.*;

import java.util.*;
public class Tinhtoan {
    public static void main(String [] args){
        String a;
        int i = 0;
        int n = 0;
        double s =0;
        ArrayList<Integer> list = new ArrayList <>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap vao he ban muon doi: vi du 8->100");
        a= sc.nextLine();
        
        if(a.equals("8->10")){
            while(!(n==100)){
                if(n!=100){
                n= sc.nextInt();
                list.add(n);
                i++;}
            }
            for( i=0; i<list.size(); i++){
                s= s+list.get(list.size()-i)*Math.pow(8, i);
            }
            System.out.print(s);
            
        }
}}
