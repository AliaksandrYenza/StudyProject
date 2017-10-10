package No1.operations;

import No1.ArrayGenerator;

public class Operations {
    private int size = ArrayGenerator.arrayGenerator().length;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void maxElement(int [] array){
        int max = array[0];
        for (int i = 0; i< ArrayGenerator.arrayGenerator().length; ++i){
            if (array[i] > max){
                max = array[i];
            }
        }
        Print.printElement( max , "Max: ");
    }

    public static void minElement(int [] array){
        int min = array[0];
        for (int i = 0; i< ArrayGenerator.arrayGenerator().length; ++i){
            if (array[i] < min){
                min = array[i];
            }
        }
        Print.printElement( min , "Min: ");
    }

    public static void length(int[] array){
        Print.printElement(array.length, "Длина массива: ");
    }

    public static void sum(int[] array){
        int sum = 0;
        for( int num : array) {
            sum = sum + num;
        }
        Print.printElement(sum, "Сумма: ");
    }

    public static void average (int[] array){
        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            average = sum / array.length;
        }
        Print.printElement(average, "Среднее арифметическое");
    }
}
