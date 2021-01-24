package SoloLearn.Constructor;

public class Tuna {
    private String girlName;

    //constructor
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
