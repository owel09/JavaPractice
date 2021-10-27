package Fundamentals.Loop;

/*
 *Created by Work on 26/10/2021 5:28 PM
 * inverted triangles
 */
public class Nestedloop2 {
    public static void main(String[] args) {

        int k = 1;
        for(int i = 0 ; i < 4 ; i++){

            for (int j = 0 ; j < 4-i ; j++){
                System.out.print(" "+k);
                k++;
            }
            System.out.println("");
        }

        System.out.println("-----------------------");

        int a = 1;
        for(int b = 0 ; b < 4 ; b++){

            for (int c = 0 ; c < b+1 ; c++){
                System.out.print(" "+a);
                a++;
            }
            System.out.println("");
        }

        System.out.println("-----------------------");

        int f = 1;
        for(int d = 1 ; d <= 4 ; d++){
            for (int e = 1 ; e <= d ; e++){
                System.out.print(" "+(f*3));
                f++;
            }
            System.out.println("");
        }

        System.out.println("-----------------------");





    }
}
