/*
 * 1.	HashSet из растений Создать коллекцию HashSet с типом элементов String. 
        Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, 
        жень-шень, земляника, ирис, картофель. Вывести содержимое коллекции на 
        экран, каждый элемент с новой строки.Посмотреть, как изменился порядок 
        добавленных элементов.

        Автор Бредихин А.И.
 */
package lab.pkg8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task1 {
    
    public static void main(String[] args) {
        Set<String> rast = new HashSet<String>();
        rast.add("арбуз");
        rast.add("банан");
        rast.add("вишня");
        rast.add("груша");
        rast.add("дыня");
        rast.add("ежевика");
        rast.add("жень-шень");
        rast.add("земляника");
        rast.add("ирис");
        rast.add("картофель");
        
        Iterator<String> iter = rast.iterator();
        
        while (iter.hasNext()) {
            System.out.print((String) iter.next()+"\n");
        }
    }
}
