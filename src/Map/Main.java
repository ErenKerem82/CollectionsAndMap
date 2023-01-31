package Map;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class Main {
    public static void main(String[] args) {

/*

        HashMap notlar = new HashMap();

        // map key,value halinde kullanılır

        notlar.put("Kerem",90); //ekleme
        notlar.put("Eymen",75);
        notlar.put("Hüseyin Abi",95);
        notlar.put("Abdülkadir",80);


        Set print = notlar.entrySet();
        Iterator itr = print.iterator();

        while (itr.hasNext()){
            Map.Entry item = (Map.Entry) itr.next();
            System.out.println(item.getKey() + " : " + item.getValue());

        }

 */




        LinkedHashMap price = new LinkedHashMap();

        price.put("iphone",8000);
        price.put("asus",3000);
        price.put("samsung",1000);
        price.put("casper",21000);

        Set s = price.entrySet();

        Iterator itr = s.iterator();
        //s.forEach(item -> System.out.println(item));


        while (itr.hasNext()){
            Map.Entry item = (Map.Entry) itr.next();
            System.out.println(item.getKey() +" : " + item.getValue());

        }


        //treemap de bunun gibi fakat alfabetik diziyor...





        /*
        // generic kullanım örneği
        HashMap<Integer , String > cities = new HashMap<>();

        cities.put(2,"Ahmet");
        cities.put(8,"Mehmet");
        cities.put(5,"Ayşe");

        for (Integer key: cities.keySet()) {
            System.out.println("Key : " + key + "  Value : " + cities.get(key));

        }

         */





    }
}
