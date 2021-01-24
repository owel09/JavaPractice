package SoloLearn.Package0;

import java.util.Scanner;

public class GetterSetterMovie {

    private String title;
    private String director;
    private String rating;

    public void setTitle(String title){
        this.title = title;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTitle(){
        return title;
    }

    public String getDirector(){
        return director;
    }

    public String getRating(){
        return rating;
    }

    public GetterSetterMovie(String title, String director, String rating){
        //constructor sinalo nya agad yun value doon sa instance call

        setTitle(title);
        setDirector(director);
        setRating(rating);

    }

    public static void main(String[] args) {
        GetterSetterMovie movie1 = new GetterSetterMovie("Van Helsing","Vanessa","PG-13");
        //di pwedeng blank yun parameter dito kasi  iniinitialize nya yun values dito. Pwede sya ma-overide sa setter

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your movie:");
        String input = scan.nextLine();

        movie1.setTitle(input);

        System.out.println("Title: " + movie1.getTitle() + "\nDirector: " + movie1.getDirector() + "\nRating: " + movie1.getRating());


    }

}
