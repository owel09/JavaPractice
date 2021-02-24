package Fundamentals.Constructor;

public class Tuna {
    private String girlName;

    //CONSTRUCTOR - is method that makes a object
    //CLASS - is blueprint of an object, only have variables and methods
    public Tuna(String girlName){
        this.girlName = girlName;
    }

    public void setGirlName(String girlName) {
        this.girlName = girlName;
    }

    public String getGirlName() {
        return girlName;
    }

    public void saying (){
        System.out.println("Your first girlfriend was a " + getGirlName());
    }

    public static void main(String[] args) {
        Tuna tunaObject = new Tuna("Constructor");

        //naooveride ng setter yung initial value ng constructor
        tunaObject.setGirlName("Kelsey");

        tunaObject.saying();
    }
}
