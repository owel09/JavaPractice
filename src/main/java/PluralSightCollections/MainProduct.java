package PluralSightCollections;/*
 *Created by owel on 21/12/2019 8:22 AM
 * Iterator and Enhance Forloop display list of Products works the same
 Pero mas makapangyarihan yung E.Forloop kasi nakakapag "if" tayo para maidisplay
 yung gusto natin weight
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MainProduct {
    public static void main(String[] args) {

        Product door = new Product(1,"wooden",50);
        Product window = new Product(2, "glass",100);
        Product floor = new Product(3, "tiles",200);

        /*
        DECLARATION - Generic type parameter "Collection of Products"
        Collection <Product> products

        INSTANTIATE - a new Arraylist that only contains Product object
        new ArrayList<Product>();
         */

        Collection<Product> products = new ArrayList<>();

        products.add(door);
        products.add(window);
        products.add(floor);

        System.out.println(products);
        System.out.println("---------------------------------");

        /*
        calling iterator method - traverse element one step at a time
        final - kaya may final yan para maiwan mapalitan yun variable kasi nareredeclare
        ito every loop
        Iterator - ito yung interface
        prodIterator - ito yung variable
        products.iterator(); - tinawag natin yun iterator method sa products ArrayList

        After mo madeclare yung iterator pwede kana agad gumamit ng while loop
        while (iterator.hasNext)
        tapos variable parang sa iterator.next at pang print
         */
        final Iterator<Product> prodIterator = products.iterator();

        while (prodIterator.hasNext()){
            Product product = prodIterator.next();
            System.out.println(product);
        }

        System.out.println("---------------------------------");

        /*
        Sa Enhanced forloop variable muna tapos : yung List tapos gagamitin yun
        variable sa body
         */
        for (Product product: products
             ) {
            System.out.println(product);
        }

        System.out.println("---------------------------------");

        //PRINTING PRODUCTS MORE THAN 100KG WEIGHT USING ITERATOR

        final Iterator<Product> proditerator2 = products.iterator();

        while (proditerator2.hasNext()){
            Product product = proditerator2.next();

            if (product.getWeight() > 100){
                System.out.println(product);
            }
            else {
                proditerator2.remove();
            }

        }

        System.out.println("Products more than 100kg: " + products);
        System.out.println(products.size());
        System.out.println(products.isEmpty());

        System.out.println(products.contains(door));
        System.out.println(products.contains(floor));
        System.out.println(products.contains(window));




    }
}
