package PluralSightCollections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 *Created by owel on 21/01/2020 7:15 AM
 */
public class PriorityHelpDesk {

    private static final Comparator<Enquiry> BY_CATEGORY = new Comparator<Enquiry>() {
        @Override
        public int compare(final Enquiry o1, final Enquiry o2) {
            return o1.getCategory().compareTo(o2.getCategory());
        }
    };

    private Queue<Enquiry> enquiries = new PriorityQueue<>(BY_CATEGORY);

    public void enquire(final Customer customer, final Category type)
    {
        enquiries.offer(new Enquiry(customer,type));
    }

    public void processAllEnquiry()
    {
        Enquiry enquiry;
        while ((enquiry = enquiries.poll()) != null)
        {
            enquiry.getCustomer().reply("Have you tried to turn it off and on again?");
        }
    }

    public static void main(String[] args)
    {
        PriorityHelpDesk helpDesk = new PriorityHelpDesk();

        helpDesk.enquire(Customer.LUCAS,Category.SMARTPHONE);
        helpDesk.enquire(Customer.OWEL,Category.PRINTER);
        helpDesk.enquire(Customer.JOR,Category.COMPUTER);

        helpDesk.processAllEnquiry();
        /*
        Output 1 - no PriorityQueue
        Lucas: Have you tried to turn it off and on again?
        Owel: Have you tried to turn it off and on again?
        Jor: Have you tried to turn it off and on again?
         */

        /*
        Output 2
        Owel: Have you tried to turn it off and on again?
        Jor: Have you tried to turn it off and on again?
        Lucas: Have you tried to turn it off and on again?

        base yung priority sa enum class
            PRINTER,
            TABLET,
            COMPUTER,
            SMARTPHONE
         */

    }
}
