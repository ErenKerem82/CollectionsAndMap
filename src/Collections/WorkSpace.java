package Collections;

import java.util.*;

public class WorkSpace {
    public static void main(String[] args) {
        //System.out.println("HelloWorld");


        /*
        HashSet hashSet = new HashSet(); //importlandı

        //hashsete değer ekleme
        hashSet.add("8");
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");

        hashSet.isEmpty();
        hashSet.forEach(item -> System.out.println(item));
        //hashSet.remove("4");


        //System.out.println(hashSet);

         */



        /*
        LinkedHashSet namazVakits = new LinkedHashSet();
        namazVakits.add("Sabah");
        namazVakits.add("ogle");
        namazVakits.add("ikindi");
        namazVakits.add("aksam");
        namazVakits.add("yatsı");
        // sırası ile diziyor

        namazVakits.forEach(item -> System.out.println(item + "..."));
        // -> : pointer işareti

         */


        /*
        TreeSet onluk = new TreeSet();
        onluk.add(60);
        onluk.add(30);
        onluk.add(90);
        onluk.add(10);
        onluk.add(100);
        onluk.add(6798650);
        onluk.add(40);
        //onluk.add(null);
        // kucukten buyuge ---

        onluk.clear();

        onluk.forEach(item -> System.out.println(item));

         */





        /*
        ArrayList cities = new ArrayList();

        cities.add("Istanbul");
        cities.add("Malatya");
        cities.add("Adiyaman");
        cities.add("Diyarbakir");
        cities.add("Kars");

        cities.add("Malatya");
        cities.add("Kars");
        cities.remove("Istanbul");

        cities.forEach(value -> System.out.println(value));

         */






        /*
        LinkedList linkedList = new LinkedList();

        //Big-O Açısından :
        // Arraylistler linkedlistlere göre daha avantajlıdır.(verimlilik açısından)
        //teorik olarak Arraylistin Big-O su O(1) ise linkedlistin O(n)
        // arraylistler ekleme ,, linkedlistler silme üzerine daha kullanışlıdır

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        linkedList.remove(3);
        linkedList.clear();

        linkedList.forEach(print -> System.out.println(print));

         */




        Queue yoklama = new LinkedList();

        //peek()
        //poll()

        yoklama.offer("Abdulkadir");
        yoklama.add("Eymen");
        yoklama.offer("Alperen");
        yoklama.add("Huseyin Abi");

        System.out.println("This : " + yoklama.peek());
        //System.out.println("This : " + yoklama.poll());


        yoklama.forEach(item -> System.out.println(item));







    }
}
