import java.util.Arrays;

public class sortingOfArrayInteger {

    public static void main(String args[]){
        
        int num[]={33,12,2,11,4566,23,13};

        for(int i=0;i<num.length;i++){

            for(int j=i+1;j<num.length;j++){

                int temp;
                if (num[i]>num[j]) {
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(num));
    }

}
