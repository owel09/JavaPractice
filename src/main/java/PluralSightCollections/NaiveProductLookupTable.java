package PluralSightCollections;

import java.util.ArrayList;
import java.util.List;

/*
 *Created by owel on 28/01/2020 6:44 AM
 */
public class NaiveProductLookupTable implements ProductLookupTable
{
    private List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product productToAdd)
    {
        for (Product product : products)
        {
            if (product.getId() == productToAdd.getId())
            {
                throw new IllegalArgumentException("Unable to add due to duplicate ID" + productToAdd);
            }
        }
        products.add(productToAdd);
    }

    @Override
    public Product lookupById(int id)
    {
        for (Product product : products)
        {
            if (product.getId() == id)
            {
                return product;
            }
        }
        return null;
    }

    @Override
    public void clear()
    {
        products.clear();
    }
}
