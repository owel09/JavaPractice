package Fundamentals.Loop;

/*
 *Created by Work on 26/10/2021 2:27 PM
 */
public class WhileDemo {
    public static void main(String[] args) {

        int i = 0;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        System.out.println("--------------------");

        int x = 10;
        while(x>=0){
            System.out.println(x);
            x--;
        }

        System.out.println("--------------------");

        //do while loop 1 guarantee loop execution
        int y = 20;
        do {
            System.out.println(y);
            y++;
        }while(y<30);

    }
}
