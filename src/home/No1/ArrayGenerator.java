package No1;

public class ArrayGenerator {
    public static int [] arrayGenerator(){
        int [] array = new int[(int) (Math.random()*9)];
        for (int i=0; i<array.length; i++){
            array[i] = (int) (Math.random()*9);
        }
        return array;
    }
}
