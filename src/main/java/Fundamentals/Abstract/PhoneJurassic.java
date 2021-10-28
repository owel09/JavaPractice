package Fundamentals.Abstract;
/*
ito yung abstract class na may mga methods na dapat mo sundin
 */

abstract class PhoneJurassic extends Phone{

    @Override
    public void text(){
        System.out.println("texting using Jurassic phone");
    }

    @Override
    public void call(){
        System.out.println("calling using Jurassic phone");
    }

    @Override
    public void addContacts(){
        System.out.println("adding contacts using Jurassic phone");
    }

}
