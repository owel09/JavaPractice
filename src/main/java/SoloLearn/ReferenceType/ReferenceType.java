package SoloLearn.ReferenceType;


public class ReferenceType {

    static void addOneTo (int num){
        num = num + 1;
    }

    public static void main(String[] args) {
        int x = 5;
        addOneTo(x);
        System.out.println("Value type variable x = "+ x);
        /*
        Output: 5
        Akala ko rin 6 kaso kung titingnan mo mabuti wala naman return yun addOneTo
        x is value type variable. Di naman nya talaga pinasa yun 5 sa method
        */

        ReferenceTypePerson john;
        /*Declarion ng Reference type variable john. Ibig sabihin address lang talaga yun laman ni John.
        address yun ng ReferenceTypePerson object.
         */

        john = new ReferenceTypePerson("JohnDee");
        /*
        Constructor talaga ito ng ReferenceTypePerson object.
        "new" magseset sya ng memomry allocation para sa ReferenceTypePerson object
        "john =" magkakaroon si john ng address sa ReferenceTypePerson object
         */

        System.out.println("Calling getAge before setAge: "+john.getAge());
        /*
        Output: 0
        wala pa kasi talgang laman to kaya 0
         */

        john.setAge(20);
        /*
        dahil sa Reference variable john. Kaya na natin i-manipulate yun ReferenceTypePerson object
        katulad ng setAge method.
         */

        System.out.println("Calling getAge after setAge: "+john.getAge());

        john.celebrateBirthday();
        /*
        Normal na pagcall sa method
         */

        objectAsParameterCelebrateBirthday(john);
        System.out.println(john.getAge());

        System.out.println("True form ng Reference Variable John: "+john);
        /*
        Ouput: ReferenceType.ReferenceTypePerson@5f184fc6
         */

    }

    private static void objectAsParameterCelebrateBirthday(ReferenceTypePerson john) {
        john.setAge(john.getAge()+1);

    }


}
