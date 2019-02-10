
package newpackage1;
import java.io.*;
import java.util.*;
public class DictionaryMangement extends Dictionary {
     static int i, n;
     void insertFromCommandline(){
     Scanner sc = new Scanner (System.in);
     n= Integer.valueOf(sc.nextLine());
     for(i=0; i<n; i++){
         Word word = new Word();
         System.out.println("English:");
         word.word_target= sc.nextLine();
         System.out.println("Vietnamese:");
         word.word_explain= sc.nextLine();
         list.add(word);
     }
}       
     //Ham doc du lieu vao file
     void  insertFromFile() throws IOException{
         try(BufferedReader br = new BufferedReader (new FileReader("Dictionarise.txt"))){
             String currentLine;    //Tao doi tuong de doc tung dong file;
             while((currentLine=br.readLine() )!=null){
                 Word word = new Word();
                 String[] splitString;
                 splitString = currentLine.split("\t");
                 word.word_target= splitString[0];
                 word.word_explain= splitString[1];
                 list.add(word);
                 
             }
             
         }catch(IOException e){
                     e.printStackTrace();
                     }
         
     }
     //Ham tra cuu tu dien bang dong lenh
     void dictionaryLookup(){
         Scanner sc = new Scanner(System.in);
         String wordLookup;
         System.out.println("Lookup: ");
         wordLookup = sc.nextLine();
         for(i=0; i<list.size(); i++){
             if(list.get(i).word_target.equals(wordLookup)){
              System.out.println(list.get(i).word_target +" "+ list.get(i).word_explain);   
              break;
             }
             else {
                 System.out.println("Not found!");
             }
         }
     }
     
     
     
}
