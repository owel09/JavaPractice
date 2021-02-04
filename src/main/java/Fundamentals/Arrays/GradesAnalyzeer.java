package Fundamentals.Arrays;

public class GradesAnalyzeer {

    public static void main(String[] args) {
        int grades [] = {90,64,83,76};
        int sum = 0;
        int average = 0;

        if (grades.length < 0){
            System.out.println("Grades is empty");
        }

        else if(grades.length > 0){
            for (int x = 0; x <= grades.length-1 ; x++){
                sum = sum + grades[x];
                average = sum / grades.length;
            }
        }

        System.out.println("Average is " + average);

    }


}
