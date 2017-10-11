package No1;

import java.util.Random;

public class ArrayGenerator {
    public static int [] arrayGenerator(){
        Random generator = new Random();
        int [] array = new int[(int) generator.nextInt(10)];
        boolean flag;
        int number;
        for (int i=0; i<array.length; i++){
            number = generator.nextInt( 100 );
            flag=true;
            for(int j=0; j<=i; j++) {
                if(number==array[j])
                    flag=false;
            }
            if(flag){
                array[i]=number;
            }else{
                i--;
            }
        }
        return array;
    }
}
