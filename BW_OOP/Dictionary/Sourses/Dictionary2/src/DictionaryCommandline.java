

import java.io.IOException;
import java.util.*;

public class DictionaryCommandline extends DictionaryMangement {
    
    void showAllWords(){
        Collections.sort(list);
    
        System.out.printf("%3s %-30s %-30s\n", " No|", "English", "|Vietnamese");
        for(int i=0; i<list.size(); i++){
            System.out.printf("%3d| %-30s| %-30s\n",i+1, list.get(i).word_target, list.get(i).word_explain);
        }
    }
    
    void dictionaryBasic(){
        insertFromCommandline();
        showAllWords();
    }
    void dictionaryAdvanced() throws IOException {
        insertFromFile();
        addWord();
        showAllWords();
        deleteWord();
        showAllWords();
        dictionaryLookup();
    }
    void dictionarySeacher(){
        String guessWord, a;
       int j, temp;
        guessWord = sc.nextLine();
        for(i=0; i<list.size(); i++){
            temp=0;
            a= list.get(i).word_target;
            if(guessWord.charAt(0)!=a.charAt(0)){
                    break;
                }
            else{
                temp=1;
             for( j=1; j< guessWord.length(); j++){
                 if(guessWord.charAt(j)==a.charAt(j))
                    temp++;
        }
          if(temp==guessWord.length()){
                System.out.println(list.get(i).word_target+"\n");
            } 
            }
            
    }
    }
}
