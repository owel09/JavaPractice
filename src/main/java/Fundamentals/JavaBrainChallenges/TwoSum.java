package Fundamentals.JavaBrainChallenges;/*
 *Created by User on Oct, 2019 7:52 AM

 *Challenge: Given an array and an expected sum,
  you are required to find the index of the two numbers in the array whose sum adds up to the number

  Example:

  Given nums = [2, 7, 11, 15] target = 9

  Because nums[0] + nums [1] = 2 + 7 = 9,
  return [0,1]

 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int [] numbers = new int[] {2,3,7,4,8};
        int target = 7;
        int [] result = getTwoSum(numbers,target);
        System.out.println(result[0] + " " + result[1]);


    }

    public static int[] getTwoSum(int[] numbers, int target){

        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        for(int i=0; i < numbers.length; i++){
            int delta = target - numbers[i];

            if (visitedNumbers.containsKey(delta)){
                return new int[]{i,visitedNumbers.get(delta)};
            }
            visitedNumbers.put(numbers[i],i);
        }
        return new int[] {-1,-1};
    }


}
