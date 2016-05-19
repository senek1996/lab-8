/*
 * 6.	Коллекция HashMap из Object Есть коллекция HashMap<String, Object>,
        туда занесли 10 различных пар объектов. Вывести содержимое коллекции
        на экран, каждый элемент с новой строки.Пример вывода (тут показана
        только одна строка): Sim - 5
        Автор: Бредихин А.И.
 */
package lab.pkg8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class xxx{
    int a;
    int b;
    int c;
    
    xxx() {
        this.a=(int)(Math.random()*100+1);
        this.b=(int)(Math.random()*100+1);
        this.c=a*b;
    }
    
    @Override
    public String toString() {
        String s=this.a+"*"+this.b+"="+this.c;
        return s;
    }    
}

public class Task6 {
    
    public static String gen() {
        String s="";
        for (int i=1; i<=5; i++) {
            char c=(char)(97+(int)(Math.random()*29));
            s=s+c;
        }
        return s;
    }
    
       
    
    public static void main(String[] args) {
        Map<String,Object> mapa = new HashMap<String,Object>();
        
        for (int i=0; i<10; i++) mapa.put(gen(), new xxx());
        
        Iterator<Map.Entry<String,Object>> iter = mapa.entrySet().iterator();
        
        while (iter.hasNext()) {
            Map.Entry<String,Object> para = iter.next();
            System.out.print(para.getKey()+" "+para.getValue().toString()+"\n");
        }
    }
}
