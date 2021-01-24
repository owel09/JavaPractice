package PluralSightCollections;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

import static PluralSightCollections.Category.COMPUTER;
import static PluralSightCollections.Category.PRINTER;

/*
 *Created by owel on 10/01/2020 8:30 AM
 */
public class HelpDesk {

    //instantiation of ArrayDeque. kapag may "new" ibig sabihin instantiate
    private final Queue<Enquiry> enquiries = new ArrayDeque<Enquiry>();

    /*
    Customer how takes the enquiry and Category of problems
     */
    public void enquire(final Customer customer, final Category category){
        /*
        tatawagin ynung Enquiry gamit yung queue
         */
        enquiries.offer(new Enquiry(customer,category));
    }

    //ito yung method na mas specific for printer only kaya kinoment out
    // natin yun processAllEnquries()
    public void processPrinterEnquiry()
    {
        /*
        importante na ideclare yun Enquiry class lagi sa method para magamit mo yung mga method nya
        enquiries ginagamit nya yung mga method ng Arrayqueue
         */
        processEnquiry(
                enq -> enq.getCategory() == PRINTER,
                "Is it out of paper?");

    }

    public void processGeneralEnquiry(){

        processEnquiry(
                enquiry -> enquiry.getCategory() != PRINTER,
                "have you tried to turn it on and off again?");
    }

    private void processEnquiry(final Predicate<Enquiry> predicate, final String message)
    {
         /*
        peek() method will check the head of the queue.
        we could check the head of the queue and remove it
        without altering the order
         */
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && predicate.test(enquiry))
        {
            enquiries.remove();
            enquiry.getCustomer().reply(message);
        }
        else
        {
            System.out.println("no work to do, let's have some coffee");
        }

    }

    public static void main(String[] args) {

        HelpDesk helpDesk = new HelpDesk();



//        helpDesk.enquire(owel,car);
//        helpDesk.enquire("owel","car");
//        di ito gagana kasi may Customer class tayo na nakadefine

        helpDesk.enquire(Customer.OWEL, COMPUTER);
        helpDesk.enquire(Customer.JOR, PRINTER);

        /*
        this is to print out owel and jor response in order
         */
//        helpDesk.processAllEnquries();

        helpDesk.processPrinterEnquiry();
        helpDesk.processGeneralEnquiry();
        helpDesk.processPrinterEnquiry();
        /*
        Output:
        no work to do, let's have some coffee
        Owel: Have you tried to turn it off and on again?
        Jor: is it out of paper?

        no work - kasi computer problem yun nasa unahan ng queue
        have you tried - kasi pumasok na yung generalenquiry at pasok yung computer as general
        is it out - kasi printer problem na yun kay jor

         */

    }
}
