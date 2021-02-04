package Fundamentals.Package1;

public class ClassTemplate {

    int day = 1;
    public int week = 7;
    protected int month = 31;
    protected int year = 365;

    public int printWeek(){

        return week + day + month + year;
    }

}
