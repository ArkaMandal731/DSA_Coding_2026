import java.util.Arrays;
import java.util.*;

public class findMissingNumberFromArray {

    // This logic can handle both negative and postive missing values from an array, but the missing number should be only 1 element.

    public static void main(String args[]){

        int num[]={-10,-9,-1,-2,-6,-3,-7,-8,1,2,3,0,-5};
        Arrays.sort(num);

        int sum=0;
        int sum1=0;

        for(int i=0;i<num.length;i++){
            sum+=num[i];
        }

        for(int i=num[0];i<=num[num.length-1];i++){
            sum1 +=i;
        }
        System.out.println(sum1-sum);
    }

}
