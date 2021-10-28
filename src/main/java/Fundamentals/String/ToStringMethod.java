package Fundamentals.String;

/*
 *Created by Work on 28/10/2021 5:43 PM
 * practice lang kung paano mag overide ng toString method.
 * toString method returns the String representation of the object
 */
public class ToStringMethod {

    int rollno;
    String name;
    String school;

    public ToStringMethod(int rollno, String name, String school){
        this.rollno=rollno;
        this.name=name;
        this.school=school;
    }

    @Override
    public String toString(){
        return " rollno: " + rollno + " name: " + name + " school: " + school;
    }
}

class ToStringMethodRunner{
    public static void main(String[] args) {

        ToStringMethod toStringMethod = new ToStringMethod(1,"Owel","UST");
        System.out.println(toStringMethod);
    }
}
