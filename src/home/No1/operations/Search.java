package No1.operations;

public class Search {
    private boolean exist[] = new boolean[11];

    public void searchElement (int [] array, int number){
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

    public void changeElement(int[] array, int number){
        Operations operations = new Operations();
        operations.setSize(operations.getSize()+1);
        array[operations.getSize()-1] = number;
        exist[number] = true;
    }
}
