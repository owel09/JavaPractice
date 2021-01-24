package SoloLearn.Enum;

public class UserStatusRunner {

    public static void main(String[] args) {
        System.out.println(UserStatus.ACTIVE);
        /*
        Output:
        ACTIVE
         */

        for(UserStatus status: UserStatus.values()){
            System.out.println(status);
            /*
            Output:
            PENDING
            ACTIVE
            INACTIVE
            DELETED

            naprint lahat ng status gamit yung for at values method
             */
        }
    }
}
