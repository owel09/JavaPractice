package PluralSightCollections;

/*
 *Created by owel on 23/01/2020 7:35 AM
 */
public interface ProductLookupTable
{
    Product lookupById(int id);

    void addProduct (Product productToAdd);

    void clear();
}
