package Fundamentals.Enum;

public class MobileRunner {

    public static void main(String[] args) {
        Mobile myMobile = Mobile.APPLE;

        switch (myMobile){
            case APPLE:
                System.out.println("This is apple");
                break;
            case SAMSUNG:
                System.out.println("This is samsung");
                break;
            case HUAWEI:
                System.out.println("This is huawei");
                break;
        }

        System.out.println(myMobile.APPLE.getPrice());

        for (Mobile printEnum : Mobile.values()){
            System.out.println(printEnum);
        }
        /*
        Output:tyty
        APPLE
        SAMSUNG
        HUAWEI

        magical daw yun values method kasi di sya galing sa enum class at object class pero nagamit ko sya
         */

    }
}
