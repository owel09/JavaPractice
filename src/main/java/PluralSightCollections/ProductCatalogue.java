package PluralSightCollections;
/*
 *Created by owel on 27/12/2019 5:29 PM
 * ProductCatalogue  is the number of product we are going to offer
 * iterate over the products
 * add products kasi may supplier
 */


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static PluralSightCollections.Product.BY_NAME;


public class ProductCatalogue implements Iterable<Product>{

//    private final Set<Product> products = new HashSet<>();

    private final Set<Product> products = new TreeSet<>(BY_NAME);
    /*
    mag ClassCastExeption kasi yung Constructor ng TreeSet ay di sya tatanggap ng
    kung paano yung order sa TreeSet. If you don't provide the order the Objects in
    the TreeSet will be comparable, kapag comparable may natural built-in sort.

    Para ma-fix magdedeclare ka ng Comparator sa Product
     */


    public void isSuppliedBy(Supplier supplier){

        products.addAll(supplier.products());

    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
