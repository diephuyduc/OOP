package newpackage1;

import java.io.IOException;
import java.util.*;

public class DictionaryCommandline extends DictionaryMangement {
    
    void showAllWords(){
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
        showAllWords();
        dictionaryLookup();
      //  addWord();
    }
}
