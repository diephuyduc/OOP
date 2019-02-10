/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary.newpackage;

/**
 *
 * @author Huy Duc
 */
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
}
