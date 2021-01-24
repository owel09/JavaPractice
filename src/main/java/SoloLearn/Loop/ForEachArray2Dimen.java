package SoloLearn.Loop;

/*
for each loop na ipprint
for each loop ipprint yung value ng 2 dimensional array
 */

public class ForEachArray2Dimen {

    public static void main(String[] args) {

        int arr [] = {1,2,3,4,5};

        int twoDimArr [][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10}
        };

        for(int i=0 ; i<= arr.length-1 ; i++){
            System.out.println(arr[i]);
        }

        System.out.println("-----------------------");

        for (int k : arr
                /*
                ang kinagandahan ng for each is hindi mo na kailangan itrack kung ilan yung total value ng array
                napupunta yung 1st element ng arr[] sa k
                 */

             ) {
            System.out.println(k);
        }

        System.out.println("-----------------------");

        for (int b[] : twoDimArr
                /*
                kapag gumagamit ng twoDimArr sa for each, dapat naka declare as array yung variable b[]
                kasi yung first element ng twoDimArr is naka-array {1,2,3,4}
                yung b is not a normal int variable dapat naka-array siya
                 */
             ) {

            for (int c: b
                    /*
                    itong loop na ito yung magttravel sa b[] na siyang first elemet ng twoDimArr[]
                     */
                 ) {

                System.out.print(" "+c);

            }

            System.out.println(" ");

        }

    }
}
