package PluralSightCollections;

/*
 *Created by owel on 16/01/2020 8:13 AM
 */

/*
Enquiry Object that represent the HelpDesk Enquiry task
 */
public class Enquiry {

    /*
    each enquiry has a customer and category
     */
    private final Customer customer;
    private final Category category;

    public Enquiry(Customer customer, Category category) {
        this.customer = customer;
        this.category = category;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Enquiry{" +
                "customer=" + customer +
                ", category=" + category +
                '}';
    }
}
