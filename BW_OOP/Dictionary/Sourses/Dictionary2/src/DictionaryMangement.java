import java.io.*;
import java.util.*;
public class DictionaryMangement extends Dictionary {
     static int i, n;
     static Scanner sc = new Scanner (System.in);
     void insertFromCommandline(){
     
     n= Integer.valueOf(sc.nextLine());
     for(i=0; i<n; i++){
         Word word = new Word(null, null);
         System.out.println("English:");
         word.word_target= sc.nextLine();
         System.out.println("Vietnamese:");
         word.word_explain= sc.nextLine();
         list.add(word);
     }
}       
     
     //Ham doc du lieu vao file
     ArrayList  insertFromFile() throws IOException{
         try(BufferedReader br = new BufferedReader (new FileReader("Dictionarise.txt"))){
             String currentLine;    //Tao doi tuong de doc tung dong file;
             while((currentLine=br.readLine())!=null){
                 Word word = new Word(null, null);
                 String[] splitString;
                 splitString = currentLine.split("\t");
                 word.word_target= splitString[0];
                 word.word_explain= splitString[1];
                 list.add(word);
                 
             }
             
         }catch(IOException e){
                     e.printStackTrace();
                     }
         
        Collections.sort(list);
         return list;//  Collections.sort (list);
     }
     
        
     
     //Ham tra cuu tu dien bang dong lenh
     void dictionaryLookup(){
       //  Scanner sc = new Scanner(System.in);
         String wordLookup; 
         int temp= 0; 
         System.out.println("Lookup: ");
         wordLookup = sc.nextLine();
         for(i=0; i<list.size(); i++){
             if(list.get(i).word_target.equals(wordLookup)){
              System.out.println(list.get(i).word_explain);
              break;
              }
             }
         
    
}
     //Ham them vao danh sach;
     void addWord(){
         Word newWord = new Word (null, null);
         newWord.word_target = sc.nextLine();
         newWord.word_explain = sc.nextLine();
         list.add(newWord);
   //      Collections.sort(list);
        }
     
     void deleteWord (){
         String deleteWord;
         int temp=0;
         deleteWord= sc.nextLine();
         for(i=0; i<list.size(); i++){
             if(list.get(i).word_target.equals(deleteWord)){
                 list.remove(i);
             }
         }
         
         
     }
     void editWord(){
         Word edit = new Word (null, null);
         
         edit.word_target = sc.nextLine();
         edit.word_explain = sc.nextLine();
         for(i=0; i<list.size(); i++){
             if(edit.word_target.equals(list.get(i).word_target)){
                list.set(i, edit);
         }
             
             else if( edit.word_explain.equals(list.get(i).word_explain)){
                 list.set(i, edit);
             }
         }
         
     }
     
     void  dictionaryExportToFile() throws IOException{
         try(BufferedWriter bw = new BufferedWriter (new FileWriter("ExportDictionarise.txt"))){
             
             
             for(i=0; i<list.size(); i++){
                String word_tar = list.get(i).word_target;
                bw.write(word_tar);
                bw.write("\t");
                String word_exp= list.get(i).word_explain;
                bw.write(word_exp);
                bw.write("\n");
             }
         }
         catch(IOException e){
             e.printStackTrace();
         }
     }
//     
}
