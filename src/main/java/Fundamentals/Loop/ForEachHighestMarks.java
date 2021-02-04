package Fundamentals.Loop;

public class ForEachHighestMarks {

    public static void main(String[] args) {

        int [] marks = {1,2,3,4,5};

        int highestMarks = maxValue(marks);

        System.out.println("The highest value is: " + highestMarks);


    }

    public static int maxValue(int[] marksInst){

        int maxSoFar = marksInst[0];
        /*
        mapupunta na maxSoFar yung value ng marks
         */

        for (int ctr : marksInst
                /*
                ctr[0] = marksInst[0]
                syntax ng ForEach type and variable : list tapos gagamitin ko na yung variable
                 */
             ) {

            if (ctr > maxSoFar){

                maxSoFar = ctr;
            }
        }
        return maxSoFar;
    }
}
