package PluralSightCollections;/*
 *Created by owel on 27/12/2019 5:38 PM
 */

import java.util.ArrayList;
import java.util.List;

public class Supplier {

    private String name;
    private final List<Product> products = new ArrayList<>();

    public Supplier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Product> products(){
        return products;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
