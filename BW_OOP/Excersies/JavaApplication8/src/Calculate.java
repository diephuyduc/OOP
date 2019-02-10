
public class Calculate {
    private int tu;
    private int mau;
    Calculate(int tu, int mau){
        this.tu=tu;
        this.mau=mau;
    }
    void settu(int t){this.tu=t;} int gettu(){return this.tu;}
    void setmau(int m){this.mau= m;} int getmau(){return this.mau;}
    static int GCD (int t, int m){
         t=Math.abs(t);
        m=Math.abs(m);
        while(t!=m){
            if(t>m) {t=t-m;}
            else{ m=m-t;}
        }
        return m;
    }
    Calculate Tong(Calculate p1, Calculate p2){
        Calculate a = new Calculate(1, 1);
        a.tu= (p1.tu *p2.mau + p2.tu *p1.mau);
        a.mau=p1.mau *p2.mau;
        
       
        if(a.tu!=0&&a.mau!=0){
            int d= GCD(a.tu, a.mau);
        a.tu=a.tu/d;
        
        a.mau=a.mau/d;}
        
       return a;
    }
    Calculate Hieu(Calculate p1, Calculate p2){
        Calculate a = new Calculate(1, 1);
        a.tu= (p1.tu *p2.mau - p2.tu *p1.mau);
        a.mau=p1.mau *p2.mau;
        
        if(a.mau!=0&&a.tu!=0){
            int d= GCD(a.tu, a.mau);
        a.tu=a.tu/d;
        a.mau=a.mau/d;}
        
        
        return a;
    }
    Calculate Tich(Calculate p1, Calculate p2){
        Calculate p3 = new Calculate ( 1, 1);
        p3.tu= p1.tu*p2.tu;
        p3.mau= p1.mau*p2.mau;
       int d= GCD(p3.tu, p3.mau);
        if(p3.mau!=0){
            p3.tu=p3.tu/d;
            p3.mau=p3.mau/d;
        }
        return p3;
    }
    Calculate Thuong(Calculate p1, Calculate p2){
        Calculate p3 = new Calculate ( 1, 1);
        p3.tu= p1.tu*p2.mau;
        p3.mau= p1.mau*p2.tu;
       
        if(p3.mau!=0){
            int d= GCD(p3.tu, p3.mau);
            p3.tu=p3.tu/d;
            p3.mau=p3.mau/d;
        }
        return p3;
    }
    public boolean equals (Calculate p1, Calculate p2){
        Calculate a = new Calculate(1, 1);
        float c, d;
        c=a.tu= (p1.tu *p2.mau - p2.tu *p1.mau);
        d=a.mau=p1.mau *p2.mau;
        if(a.mau!=0&&(c/d>0))
            return true;
        else
            return false;
        
    }
    void outPut(Calculate c){
        if(c.mau!=1){
        System.out.print(c.tu+"/"+c.mau);
    }
        else System.out.print(c.tu);
}}
class PhanSo {

public static void main(String args []){
    Calculate c= new Calculate(1,1);
    Calculate a= new Calculate(5, 13);
    Calculate b= new Calculate(8, 7);
    
    System.out.print("Tong: ");
    c.outPut(c.Tong(a, b));
    System.out.print("\nHieu: ");
    c.outPut(c.Hieu(a, b));
    System.out.print("\nTich: ");
    c.outPut(c.Tich(a, b));
    System.out.print("\nThuong: ");
    c.outPut(c.Thuong(a, b));
    System.out.print("\nKet qua so sanh hai so vua nhap vao: ");
        c.outPut(a);
        if(c.equals(a, b)==true){
        System.out.printf(" %s ",">");
     } 
        else  { 
       System.out.printf(" %s ", "<");}
       c.outPut(b);
       System.out.println(" ");
    
    
    
}}


