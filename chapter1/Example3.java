package chapter1;
/*Программа иллюстрирует отличие между int и double */

public class Example3 {
    public static void main(String[] arg){
        int v;
        double x;
        v = 10;
        x = 10.0;
        System.out.println("Первоначальное значение v:" + v);
        System.out.println("Первоначальное значение x:" + x);
        System.out.println();// вывод пустой строки
      // Поделить обе переменных на 4
      v = v/4;
      x = x/4;
      System.out.println(" v после деления :"+ v);
      System.out.println(" x после деления :"+ x);
    }
}
