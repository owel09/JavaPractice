package SoloLearn.Enum;

public class WhoisRIRRunner {
    public static void main(String[] args) {

        System.out.println(WhoisRIR.APNIC.getUrl());
        /*
        Output:
        whois.apnic.net

        Bago ko makuha ito gumawa pa ko ng contructor at getter method sa Enum WhosisRIR
         */

        WhoisRIR rir = WhoisRIR.APNIC;
        /*
        dinedeclare no na isave yun WhoisRIR.APNIC sa rir
         */

        System.out.println(rir);
        /*
        Output:
        APNIC
         */

        if(rir == WhoisRIR.APNIC){
            System.out.println("This is APNIC " + rir.getUrl());
        }

        WhoisRIR rir1 = WhoisRIR.ARIN;

        switch (rir1){
            case ARIN:
                System.out.println("This is ARIN");
                break;
            case APNIC:
                System.out.println("This is APNIC");
                break;
            case RIPE:
                System.out.println("This is RIPE");
                break;
            default:
                throw new AssertionError("Unknown RIR " + rir1);
        }

    }
}
