package No1.operations;

import No1.consolMenu.Menu;

public class Search {
    private boolean exist[] = new boolean[11];

    public void searchElement (int [] array){
        System.out.println("Введите искомое число");
        int number = Menu.getInt();
        boolean flag = false;//Объявляем переменную - флаг
        int[] x = new int[array.length];
        for(int i=0;i<array.length;++i)
        {
            if (x[i]==number)
            {
                System.out.println("Да ваше число совпадает с числом из массива!");
                System.out.println(x[i] + " = " + number);
                flag = true;
            }
        }
        if (flag == false)
        {
            System.out.println("Такого числа нет");
            return;
        }
    }

    public void changeElement(int[] array){
        System.out.println("Введите число для замены:");
        int newValue = Menu.getInt();
        System.out.println("Введите No. заменяемого элемента");
        int number = Menu.getInt();
        array[number] = newValue;
        Print.printElement(newValue, "Элемент ["+ number+ "] заменён на ");
    }
}
