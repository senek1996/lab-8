/*
 * 2.	HashMap из 10 пар Создать коллекцию HashMap<String, String>, занести 
        туда 10 пар строк: арбуз - ягода, банан - трава, вишня - ягода, 
        груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень, 
        земляника - ягода, ирис - цветок, картофель - клубень. Вывести 
        содержимое коллекции на экран, каждый элемент с новой строки. Пример 
        вывода (тут показана только одна строка):картофель - клубень.

        Автор Бредихин А.И.
 */
package lab.pkg8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String,String> frukti = new HashMap<String,String>();
        
        frukti.put("арбуз", "ягода");
        frukti.put("банан", "трава");
        frukti.put("вишня", "ягода");
        frukti.put("груша", "фрукт");
        frukti.put("дыня", "овощ");
        frukti.put("ежевика", "куст");
        frukti.put("жень-шень", "корень");
        frukti.put("картофель", "клубень");
        frukti.put("ирис", "цветок");
        frukti.put("земляника", "ягода");
       
        Iterator<Map.Entry<String, String>> iter = frukti.entrySet().iterator();
        
        while (iter.hasNext()) {
            
            Map.Entry<String, String> para = iter.next();
            String key = para.getKey();            //ключ
            String value = para.getValue();        //значение
            System.out.println(key + " - " + value+"\n");
        }

    }
}
