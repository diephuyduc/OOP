/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan4;
import java.io.*;
import java.lang.*;

/**
 *
 * @author Huy Duc
 */
public class NewClass1 {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        int count=0;
        String currentLine;
        try(BufferedReader br = new BufferedReader (new FileReader("Data.txt"))){
            while ((currentLine = br.readLine())!= null){
                String []splitString = currentLine.split("\\s");
                count += splitString.length;
            }
            System.out.println( count);
        }
        catch ( IOException e){
            e.printStackTrace();
        }
    }
}
