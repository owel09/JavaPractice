package PluralSightCollections;/*
 *Created by owel on 21/12/2019 8:21 AM
 */

import java.util.Comparator;
import java.util.Objects;

import static java.util.Comparator.comparing;

public class Product {

    public static final Comparator<Product> BY_NAME = comparing(Product::getName);

    public static final Comparator<Product> BY_WEIGHT
            = comparing(Product::getWeight);

    private final int id;
    private final String name;
    private final int weight;

    public int getId()
    {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }


    public Product(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return weight == product.weight &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }
}
