package SoloLearn.Arrays;

public class arraySum {

    public static void main(String[] args) {

        int myArr[] = {6,42,3,7};
        int sum = 0;

        for(int x=0 ; x <= myArr.length-1 ; x++){
            sum = sum + myArr[x];
        }

        System.out.println(sum);

    }
}
