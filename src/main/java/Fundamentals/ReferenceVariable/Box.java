package Fundamentals.ReferenceVariable;

public class Box {

    int length = 0;                             // mga instance variable ng Box class
    int height = 0;
    int width = 0;


    public int calculateVolume(){               //method na may return para macompute yun volume

        return length * height * width;
    }

    public static void main(String[] args) {

    }
}


