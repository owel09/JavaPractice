package PluralSightCollections;/*
 *Created by owel on 22/12/2019 3:52 PM
 */

public class ProductFixtures {

    public static Product door = new Product(1, "Narra",35);
    public static Product floor = new Product(2, "Semento",25);
    public static Product window = new Product(3, "Pawid",10);

    public static Supplier bobs = new Supplier("Bob's Household supplies");
    public static Supplier kates = new Supplier("Kate's Home Goods");

    static {
        bobs.products().add(door);
        bobs.products().add(floor);

        kates.products().add(floor);
        kates.products().add(new Product(1, "Narra", 35));
        /*
        it thinks the door are different objects, nag add ako ng hashcode and equals method
         */
    }

}
