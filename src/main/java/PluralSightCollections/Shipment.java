package PluralSightCollections;/*
 *Created by owel on 22/12/2019 3:46 PM
 */

import java.util.*;

public class Shipment implements Iterable<Product>{

    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    private static final int PRODUCT_NOT_PRESENT = -1;

    //List declaration
    private List<Product> heavyVanProducts;
    private List<Product> lightVanProducts;

    //list to hold all the products
    private final List<Product> products = new ArrayList<>();

    public void add(Product product){
        //add product in the products list
        products.add(product);
    }

    public void replace(Product oldProduct, Product newProduct){
        //find the index of the old product and use set() to set the new product
        final int indexOld = products.indexOf(oldProduct);

        //kaya pala ginagamit yung != para sa int to int ng if
        if (indexOld != PRODUCT_NOT_PRESENT){

            products.set(indexOld,newProduct);

        }

    }

    public void prepare(){
        //sort list of product by weight
        products.sort(Product.BY_WEIGHT);

        //find the product index that needs the heavy van
        int splitPoint = findSplitPoint();

        //assign views of the product list for heavy and light vans
        lightVanProducts = products.subList(0,splitPoint);
        heavyVanProducts = products.subList(splitPoint,products.size());
    }

    private int findSplitPoint() {

        for (int i = 0; i < products.size(); i++){

            //bakit pala ako nagset ng variable dito? Parang ganito rin sa Iterator
            final Product product = products.get(i);

            if (product.getWeight() > LIGHT_VAN_MAX_WEIGHT){
                return i;
            }

        }
        return 0;
    }

    public List<Product> getHeavyVanProducts() {
        return heavyVanProducts;
    }

    public List<Product> getLightVanProducts() {
        return lightVanProducts;
    }

    @Override
    public Iterator<Product> iterator() {
        //delegate iterator method in the products class
        return products.iterator();
    }
}
