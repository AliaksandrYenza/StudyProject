package No1.operations;

import No1.consolMenu.Menu;

public class Print {
    public static void inCourse(int [] array){
        System.out.print("По порядку");
        for (int i = 0; i<array.length; i++)
            System.out.println("element["+ (i+1) + "]: " + array[i]);
    }

    public static void backCourse(int [] array){
        System.out.print("В обратном порядке");
        for (int i = array.length; i>0 ; i--)
            System.out.println("element["+ (i+1) + "]: " + array[i]);
    }

    public static void sortedArray(int [] arr){
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        inCourse(arr);
    }

    public static void printElement(int element, String str){
        System.out.print(str + ":" + element);
    }

    public static void printElement(double element, String str){
        System.out.print(str + ":" + element);
    }

    public int number(){
        System.out.println("Введите число: ");
        return Menu.getInt();
    }

}
