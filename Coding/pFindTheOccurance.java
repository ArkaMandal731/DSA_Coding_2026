import java.util.*;

public class pFindTheOccurance {

    public static void main(String args[]){

        String st="My name is arka arka my and soon I am goinfg to crack a product company in bangalore in bangalore";
        String str[]=st.split(" ");

        HashMap<String, Integer> wordCount=new HashMap<String, Integer>();

        for(String word: str){
            if(wordCount.containsKey(word)){

                wordCount.put(word, wordCount.get(word)+1);
            } else {
                wordCount.put(word, 1);
            }
        }

        Set<String> wordInString= wordCount.keySet();

        for(String word: wordInString){

            if(wordCount.get(word)>1){
                System.out.println(word+ "::"+ wordCount.get(word));
            }

        }


    }

}
