/*
 * 3.	Коллекция HashMap из котов. Есть класс Cat, с полем имя (name, String).
        Создать коллекцию HashMap<String, Cat>. Добавить в коллекцию 10 котов,
        в качестве ключа использовать имя кота. Вывести результат на экран,
        каждый элемент с новой строки.

        Автор Бредихин А.И.
 */
package lab.pkg8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Cat {
    int age;
    int weight;
    
    Cat () {
        this.age=(int)(Math.random()*15);
        this.weight=(int)(Math.random()*20);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Map<String,Cat> koti = new HashMap<String,Cat>();
        koti.put("Барсик", new Cat());
        koti.put("Мурзик", new Cat());
        koti.put("Васька", new Cat());
        koti.put("Машка", new Cat());
        koti.put("Рыжик", new Cat());
        koti.put("Tom", new Cat());
        koti.put("Леопольд", new Cat());
        koti.put("Матроскин", new Cat());
        koti.put("Персик", new Cat());
        koti.put("А этот у подъезда постоянно ходит", new Cat());
        
        Iterator<Map.Entry<String,Cat>> iter = koti.entrySet().iterator();
        
        while (iter.hasNext()) {
            Map.Entry<String,Cat> para = iter.next();
            System.out.print("Кот "+para.getKey()+" возраст "+para.getValue().age+" лет, вес "+para.getValue().weight+" кг\n");
        }    
    }
}
