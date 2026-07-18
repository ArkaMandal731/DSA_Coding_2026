import java.util.*;

public class reverseWordbyWord {

    public static void main(String args[]){

        // Reverse a sentence word by word logic and word reverse the word
        //Input: Arka is good boy
        //Output: boy good is Arka

        String str="Arka is a good boy";
        String word="";
        String result="";

        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                word=str.charAt(i)+word;
            } else {
                result+= word+" ";
                word="";
            }

            
        }
        result+=word;
        System.out.println(result);




    }
}