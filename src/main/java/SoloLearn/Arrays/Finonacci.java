package SoloLearn.Arrays;

public class Finonacci {

    public static void main(String[] args) {
        int fibArr[] = new int[9];

        int prevTerm = 0;
        int currentTerm = 1;
        int nextTerm = 2;

        fibArr[0] = 0;
        fibArr[1] = 1;

        for (int x = nextTerm ; x <= fibArr.length-1 ; x++){
            int sumTerm = fibArr [prevTerm] + fibArr [currentTerm];
            fibArr [nextTerm] = sumTerm;

            prevTerm++;
            currentTerm++;
            nextTerm++;
        }

        for(int t: fibArr){
            System.out.println(t);
        }



    }


}
