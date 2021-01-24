package PluralSightCollections;

import java.util.HashMap;
import java.util.Map;

/*
 *Created by owel on 28/01/2020 7:14 AM
 */
public class MapProductLookupTable implements ProductLookupTable
{
    Map <Integer, Product> IdToProduct = new HashMap<>();

    @Override
    public void addProduct(Product productToAdd)
    {
        final int id = productToAdd.getId();
        if (IdToProduct.containsKey(id))
        {
            throw new IllegalArgumentException("Unable to add due to duplicate ID" + productToAdd);
        }

        IdToProduct.put(id,productToAdd);

    }

    @Override
    public Product lookupById(int id)
    {
        return IdToProduct.get(id);
    }

    @Override
    public void clear()
    {
        IdToProduct.clear();
    }
}
