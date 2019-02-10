/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Huy Duc
 */
public class Profile {
    String name;
    int yearsOfBirth;
    float height;
    float weight;
    String address;
    String job;
    int Old (int yearsOfBirth){
        return 2018 - yearsOfBirth +1;
    }
   void bodyMassIndex ( float height, float weight){
        float d= weight/(height*height);
        if(d<18.5) System.out.println("Underweight");
        else if(18<=d&&d<=24.9) System.out.println("Normal weight");
        else if(25<=d&&d<=29.9) System.out.println("Overweight");
        else System.out.println("Overweight");
      
    }
   
    
}
class InforOfDog {
    String name;
    float weight;
    float height;
}
class Room{
    float chieudai;
    float chieurong;
    float chieucao;
    float giatien;
    float Dientich(float chieudai, float chieurong){
      return chieucao*chieurong;  
    }
    float theTich(float chieudai, float chieurong, float chieucao){
        return chieucao*chieurong*chieudai;
    }
    float tienThuePhong ( float giatien){
        return giatien*chieudai*chieurong;
    }
    
}
class phanSo{
    int tu, mau;
    phanSo (int tu, int mau){
        this.tu= tu;
        this.mau= mau;
    }
    static int GCD (int t, int m){
         t=Math.abs(t);
        m=Math.abs(m);
        while(t!=m){
            if(t>m) {t=t-m;}
            else{ m=m-t;}
        }
        return m;
    }
    phanSo Tong(phanSo a, phanSo b){
        phanSo c = new phanSo(1, 1);
        c.tu= (a.tu *b.mau + b.tu *a.mau);
        c.mau=a.mau *b.mau;
        if(c.tu!=0&&c.mau!=0){
            int d= GCD(c.tu, c.mau);
            c.tu=c.tu/d;
            c.mau=c.mau/d;
        }
        return c;
    }
    
}
