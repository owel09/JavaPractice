package SoloLearn.Arrays;

/*
Interview question: If you have 10 unknown digits in array, how will you know the largest?
 *Created by owel on 06/03/2020 7:25 AM
 */
public class ArrayMaxNum
{
    public static void main(String[] args)
    {
        System.out.println("The largest digit in the array: "+getLargest());
    }

     static int getLargest(){

        int myArr [] = {165,2,200,4,5,600,7,8,9,1};

        int max = myArr[0];

        for (int x = 0 ; x < myArr.length ; x++){ //myArr.length = 10
            if (myArr[x] > max){ //kung mas malaki si myArr[0] kesa max?
                max = myArr[x]; //iseset natin na si myArr[0] as the new max
            }
        }
        return max;
    }

}
