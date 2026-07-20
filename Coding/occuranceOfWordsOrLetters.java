
import java.util.*;

public class occuranceOfWordsOrLetters {

    public static void main(String args[]){

        String st="I love love automation framework development I";
        String str[]=st.split(" ");

        HashMap<String, Integer> wordCount= new HashMap<String, Integer>();

        for(String word: str) {
            if(wordCount.containsKey(word)){

                wordCount.put(word, wordCount.get(word)+1);
            } else {
                wordCount.put(word, 1);
            }
        }

        Set<String> wordInString=wordCount.keySet();
        for(String word: wordInString) {

            if(wordCount.get(word)>1){
                System.out.println(word+ "::" +wordCount.get(word));
            }
        }




    }

}
