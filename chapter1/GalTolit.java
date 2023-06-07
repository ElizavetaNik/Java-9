package chapter1;
/*упражнение 1.1.
 * Программа дл преобразования галлонов в литры.
 */
public class GalTolit {
    public static void main (String[] args){
        double gallons;// хранит колтчество галлонов
        double liters; // хранит результат преобразования в литры
        gallons = 10;// начать с 10 галлонов 
        liters = gallons * 3.7854; // преобразование в литры 
        System.out.println(gallons + " галлонов соответсвует  " + liters + "  литрам.");
    }
    
}
