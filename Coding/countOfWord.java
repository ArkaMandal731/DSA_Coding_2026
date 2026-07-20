
import java.util.*;
public class countOfWord {

    public static void main(String args[]){
        String str="several coding interviews and received offers from reputed software companies. His journey proved that discipline";
        int Count=1;

        for(int i=0;i<str.length()-1;i++){

            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                Count++;

            }
        }
        System.out.println(Count);
    }

}
