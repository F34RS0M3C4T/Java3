package servise;

import filter.Filter;
import products.Consigment;

//Напишите класс «Сервис товаров» со следующими методами.

//Метод countByFilter, который получает на вход партию товара и произвольный
//фильтр из п.2. Метод возвращает количество элементов партии, имена которых
//удовлетворяют фильтру. Для товаров-наборов анализируется только название самого
//набора

public class ProductService {
    public static int countByFilter(Filter filter, Consigment consigment){
        int count = 0;
        for(int i=0;i<consigment.getCoverables().length;i++){
            if(filter.apply(consigment.getCoverables()[i].getName())){
                count++;
            }
        }
        return count;
    }
}
