package SoloLearn.Enum;

public enum Mobile {

    APPLE(80),
    SAMSUNG(90),
    HUAWEI(100);
    /*
    ang tagalang ginagawa ng compiler ay
    class Mobile{
        static final Mobile APPLE = new Mobile();
    }
    */

    Mobile() {
        System.out.println("building constructor");
        /*
        Output:
        building constructor
        building constructor
        building constructor

        constructor na walang parameter, di kasi defined yun data type ng APPLE
        3 beses na-print yun nasa constructor kasi 3 rin yun enum objects mo

         */
    }

    Mobile(int price) {
        this.price = price;
    }
    /*
    contructor ulit para sa price
    kaya nakapagset ka ng price kasi gumawa ka ng constructor na tumatanggap ng price
     */

    int price;

    public int getPrice() {
        return price;
    }
    /*
    pwede ka magcreate ng methods and variables sa loob ng enum
     */

}
