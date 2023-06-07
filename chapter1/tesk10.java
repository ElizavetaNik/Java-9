package chapter1;
public class tesk10 {
    public static void main (String[]args){
        double metre, inch ;
        int counter;
        counter = 0;
        for(inch=1;inch <= 144; inch++) {
             metre = inch /39.37; // преобразование в метры
            System.out.println (inch + "  дюйм соответсвует   " + metre + " метров.");
            counter++;// увелечение счетчика строк на каждой интерации
            // После каждой 10-й строки вывести пустую строку.
            if(counter == 12) {// если значение счетчика строк равно 10, вывести пустую строку 
            System.out.println();
            counter = 0; // сброс счетчика трок
           }
           
        }


    } 
}
