package SoloLearn.Enum;

public class RankRunner {
    public static void main(String[] args) {

        Rank myRank = Rank.CAPTAIN;
        Rank myRank1 = Rank.CAPTAIN;

        switch (myRank){
            case CAPTAIN:
                System.out.println("This is CAPT");
                break;
            case SOLDIER:
                System.out.println("This is SOL");
                break;
            case SERGEANT:
                System.out.println("This is ser");
                break;
            default:
                throw new AssertionError("Unknown RANK");
       /*
        Output:
        This is CAPT

        kasi yung capt yun tinawag natin sa declaration ng myRank
        */


        }

        System.out.println(myRank==myRank1);
        /*
        Output:
        true

        nagwowork yung enum parang primitive data type like int at iisa lang kasi yung CAPTAIN sa rank enum
         */

    }
}
