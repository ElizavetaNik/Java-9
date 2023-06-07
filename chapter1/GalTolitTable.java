package chapter1;
/*Упражнение 1.2 
 * Эта программа отображает таблицу преобразование галлонов в литры
*/



public class GalTolitTable {
    public static void main (String[]args){
        double gallons, liters;
        int counter;
        counter = 0;
        for(gallons=1;gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // преобразование в литры
            System.out.println (gallons + "  галлонов соответсвует" + liters + " литры.");
            counter++;// увелечение счетчика строк на каждой интерации
            // После каждой 10-й строки вывести пустую строку.
            if(counter == 10) {// если значение счетчика строк равно 10, вывести пустую строку 
            System.out.println();
            counter = 0; // сброс счетчика трок
           }
           
        }


    }

    
}
