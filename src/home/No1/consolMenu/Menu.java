package No1.consolMenu;

import No1.operations.Operations;
import No1.operations.Print;
import No1.operations.Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Menu {
    public static void menu(int [] array){
        boolean exit = false;
        int response;

        while (!exit) {
            System.out.print("1 - Операции \n"
                    + "2 - Печать \n"
                    + "3 - Поиск\n"
                    + "0 - Выход\n");
            response = getInt();
            switch (response) {
                case 1:
                    menuOperation(array);
                    break;
                case 2:
                    menuPrint(array);
                    break;
                case 3:
                    menuSearch(array);
                    break;
                case 0:
                    System.out.println("Выбран выход, пока-пока");
                    exit = true;
                    break;
//                default:
//                    System.out.println("Некорректный ввод, на что-то не то нажал? повтори еще раз \n");
           }
        }
    }

    public static void menuOperation(int [] array) {

        boolean exit = false;
        int response;

        while (!exit) {
            System.out.print("\t1 - Операции \n"
                    + "1.1 - Max число\n"
                    + "1.2 - Min число\n"
                    + "1.3 - Количество элементов в массиве\n"
                    + "1.4 - Сумма элементов\n"
                    + "1.5 - Среднее арифметическое\n"
                    + "0 - Назад\n\n");
            response = getInt();
            switch (response) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    Operations.maxElement(array);
                    break;
                case 2:
                    Operations.minElement(array);
                    break;
                case 3:
                    Operations.length(array);
                    break;
                case 4:
                    Operations.sum(array);
                    break;
                case 5:
                    Operations.average(array);
                    break;
                default:
                    System.out.println("Некорректный ввод, на что-то не то нажал? повтори еще раз \n");
            }
        }
    }

    public static void menuPrint(int [] array){
        boolean exit = false;
        int response;
        while (!exit) {
            System.out.print("\t2 - Печать \n"
                    + "2.1 - Печать массива в прямом порядке\n"
                    + "2.2 - Печать массива в обратном порядке\n"
                    + "2.3 - Печать массива в отсортированном порядке\n"
                    + "0 - Назад\n\n");
            response = getInt();
            switch (response) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    Print.inCourse(array);
                    break;
                case 2:
                    Print.backCourse(array);
                    break;
                case 3:
                    Print.sortedArray(array);
                    break;
                default:
                    System.out.println("Некорректный ввод, на что-то не то нажал? повтори еще раз \n");
            }
        }
    }

    public static void menuSearch(int [] array){
        boolean exit = false;
        int number = Menu.getInt();
        int response;
        Search search = new Search();
        while (!exit) {
            System.out.print("\t3 - Поиск \n"
                    + "3.1 - Проверить входит ли число в массив\n"
                    + "3.2 - Заменить элемент массива на другой\n"
                    + "0 - Назад\n\n");
            response = getInt();
            switch (response) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    search.searchElement(array, number);
                    break;
                case 2:
                    search.changeElement(array, number);
                    break;
                default:
                    System.out.println("Некорректный ввод, на что-то не то нажал? повтори еще раз \n");
            }
        }
    }

    public static int getInt() {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        sc.close();
        return i;
    }
}
