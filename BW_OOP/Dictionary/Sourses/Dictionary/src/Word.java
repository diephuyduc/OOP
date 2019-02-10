
import java.util.*;
import java.lang.*;
public class Word implements Comparable < Word > {
  String word_target;
  String word_explain;
  
  
 
  Word (String word_target, String word_explain){
      this.word_target= word_target;
      this.word_explain= word_explain;
  }
  public void setword_target( String word_target){
      this.word_target = word_target;
  }
  public void setword_explain( String word_explain){
      this.word_explain = word_explain;
  }
    @Override
    public int compareTo(Word otherWord){
        return word_target.compareTo(otherWord.word_target);
    }

    
}
//    void replace(String fixWord_target, String fixWord_explain) {
//      
//    }
//    
//    }
