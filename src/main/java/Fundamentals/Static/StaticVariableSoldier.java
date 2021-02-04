package Fundamentals.Static;

public class StaticVariableSoldier {

    public static int numSoldier = 0;

    StaticVariableSoldier(){ //constructor, everytime na gagawa ka ng object magiincrease yun numSoldier
        numSoldier++;
    }

    StaticVariableSoldier(int num){ //method na kapag may pinasa ka na value, mag-iincrease yun value ng numSoldier
        numSoldier += num;
    }

    public static void main(String[] args) {
        StaticVariableSoldier ranger = new StaticVariableSoldier();
        StaticVariableSoldier sniper = new StaticVariableSoldier();
        StaticVariableSoldier general = new StaticVariableSoldier(2);
        System.out.println(StaticVariableSoldier.numSoldier);
        System.out.println(numSoldier);
    }
}
