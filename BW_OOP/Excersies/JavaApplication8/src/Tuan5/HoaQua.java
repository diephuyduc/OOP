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
import java.io.*;
import java.util.*;
class HoaQua1 {
    static Scanner sc = new Scanner(System.in);
    String tenLoaiHoaQua;
    String xuatXxu;
    float giaTien;
    float canNang;
    
    float TongTien(){
        return giaTien*canNang;
    }
    void getngayNhap(){
       String ngayNhap;
       ngayNhap = sc.nextLine();
    }
    
    
}
class Cam extends HoaQua1{
    String tenLoaiCam;
}
class Tao extends HoaQua1{
    String tenLoaiTao;
}
class CamSanh extends Cam{
    
}
class CamCaoPhong extends Cam{
    
}
public class HoaQua{
    public static void main(String [] args){
        HoaQua1 a= new HoaQua1();
        a.getngayNhap();
    }
}
