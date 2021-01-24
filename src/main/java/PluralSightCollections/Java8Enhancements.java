package PluralSightCollections;

import java.util.HashMap;
import java.util.Map;

/*
 *Created by owel on 25/02/2020 7:51 AM
 */
public class Java8Enhancements
{
    public static void main(String[] args)
    {

        final Product defaultProduct = new Product(-1,"Whatever",100);

        final Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1,ProductFixtures.door);
        idToProduct.put(2,ProductFixtures.floor);
        idToProduct.put(3,ProductFixtures.window);

        //getOrDefault method
        // kapag wala yung id sa list pwede mo gamitin yung getOrDefault para sya na lang yung magdidisplay
        // at hindi maguupdate yung ibang id
//        Product result = idToProduct.getOrDefault(10,defaultProduct);
//        System.out.println(result);
//        System.out.println(idToProduct.get(10));

        //replace method
//        Product result = idToProduct.replace(1, new Product(1,"BigDoor",50));
//        System.out.println(result);
//        System.out.println(idToProduct.get(1));

        //replaceAll method
//        System.out.println(idToProduct);
//        idToProduct.replaceAll((key,oldProduct)->
//                new Product(oldProduct.getId(), oldProduct.getName(), oldProduct.getWeight() + 10 ));
//        System.out.println(idToProduct);

        /*
        output:
        {1=Product{name='Narra', weight=35}, 2=Product{name='Semento', weight=25}, 3=Product{name='Pawid', weight=10}}
        {1=Product{name='Narra', weight=45}, 2=Product{name='Semento', weight=35}, 3=Product{name='Pawid', weight=20}}

        nireplace nya lahat ng value ng element +10
         */

        //computeIfAbsent method
//        Product result = idToProduct
//                .computeIfAbsent(10, (id) -> new Product(10,"custom product",300));
//        System.out.println(result);
//        System.out.println(idToProduct.get(10));
//        System.out.println(idToProduct);
        /*
        output:
        Product{name='custom product', weight=300}
        Product{name='custom product', weight=300}
        {1=Product{name='Narra', weight=35}, 2=Product{name='Semento', weight=25}, 3=Product{name='Pawid', weight=10}, 10=Product{name='custom product', weight=300}}

        wala kasi dati yung id 10, dinifine ko sya gamit yung computeIfAbsent tapos mailalagay na sya sa idToProduct Map
         */
        
        //Iterate over map using forEach and lamba
        idToProduct.forEach((key, value) ->
                        System.out.println(key + "->" + value)
                );
        /*
        output:
        1->Product{name='Narra', weight=35}
        2->Product{name='Semento', weight=25}
        3->Product{name='Pawid', weight=10}
         */
    }
}
