package Fundamentals.Arrays;

import java.util.Arrays;

public class MissingN {

    public static void main(String[] args) {

        int myArr[] = {1,2,3,5};


        System.out.println(solution(myArr));


    }
    public static int solution(int[] A){

        int N = A.length;
        int counter [] = new int[N+1];

        for (int i : A){
            if (i > 0 && i <=N)
                counter[i]++;
        }

        for (int i = 1; i < N+1 ; i++)
            if (counter[i] == 0)
                return i;
        return N+1;

    }


}




