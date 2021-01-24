package SoloLearn.Polymorphism;

public class Runner {

    public static void main(String[] args) {

        Plant myplant = new Plant();
        Tree mytree = new Tree();

        Plant plant2 = mytree;  //plant2 is point to tree. The type of variable deccide what methods to call
        plant2.grow();

    }

}
