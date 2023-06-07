package chapter1;
/*Демонстрация использования оператора if */


public class ifDemo {
    public static void main (String[] args){
        int a,b,c;
        a = 2;
        b = 3;
        if (a<b) System.out.println("значение a меньше значения b");
        // Следующий оператор ничего не отобразит
        if (a == b) System.out.println("Это вы не увидите");

        System.out.println();

        c = a-b; // Переменная с содержит -1
        System.out.println("Переменная с содержит -1");
        if(c >= 0)  System.out.println("Значение с неотрицательное");
        if(c < 0)  System.out.println("Значение с отрицательное");

        System.out.println();

        c = b-a;// Тепер переменная с содержит 1
        System.out.println("Переменная с содержит 1");
        if(c >= 0)  System.out.println("Значение с неотрицательное");
        if(c < 0)  System.out.println("Значение с отрицательное");


    }

    
}
