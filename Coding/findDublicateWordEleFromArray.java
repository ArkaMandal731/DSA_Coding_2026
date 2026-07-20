
import java.util.*;
public class findDublicateWordEleFromArray {

    //Find the dublicate element irrespective of word or Integer from an array

    public static void main(String args[]){
        Integer names[]={1,2,4,3,5,3,2,44};

        for(int i=0;i<names.length;i++){

            for(int j=i+1;j<names.length;j++){

                if(names[i]==names[j]){
                    System.out.println(names[i]);
                }
            }

    }
    }
}
