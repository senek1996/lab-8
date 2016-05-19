/*
 * 4.	Вывести на экран список ключей Есть коллекция HashMap<String, String>, 
        туда занесли 10 различных строк. Вывести на экран список ключей, каждый 
        элемент с новой строки.
   5.	Вывести на экран список значений Есть коллекция HashMap<String, String>,
        туда занесли 10 различных строк. Вывести на экран список значений, каждый
        элемент с новой строки.

        Автор Бредихин А.И.
 */
package lab.pkg8;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Task4 {
    
    public static String gen() {
        String s="";
        for (int i=1; i<=5; i++) {
            char c=(char)(97+(int)(Math.random()*30));
            s=s+c;
        }
        return s;
    }
    
    public static void main(String[] args) {
        Map<String,String> kluch = new HashMap<String,String>();
        
        for (int i=0; i<10; i++) {
            kluch.put(""+(int)(Math.random()*10000), gen());
        }
        
        Iterator<Map.Entry<String,String>> iter = kluch.entrySet().iterator();
        
        while (iter.hasNext()) {
            Map.Entry<String,String> para = iter.next();
            System.out.println(para.getKey() + " - " + para.getValue()+"\n");
        }
    } 
}
