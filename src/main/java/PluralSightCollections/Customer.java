package PluralSightCollections;

/*
 *Created by owel on 10/01/2020 8:40 AM
 */
public class Customer {

    //instantiating object in the class tapos lalagyan ng name
    public static Customer OWEL = new Customer("Owel");
    public static Customer JOR = new Customer("Jor");
    public static Customer LUCAS = new Customer("Lucas");


    private String name;

    public Customer(String name) {
        this.name = name;
    }

    

    public void reply(final String message){

      /*System.out.println("%s: %s\n",name,message);
      Cannot resolve method println(java.lang.String,java.lang.String,java.lang.String)
       di basta gumagana yung println dito. kailangan naka-printf
     */
        System.out.printf("%s: %s\n",name,message);
    }
}
