package Fundamentals.Package0;

public class GetterSetterStudent { //There's a class called Student with an attribute called knowledge.

    private String knowledge; // Since we'd rather not pick Student's brain directly to teach new things,
                              // we made sure knowledge is secure and private inside the skull.

    public void listen(String ears){    //In order to teach Student, there's a setter method called listen() that anyone can use.
                                        //It will be pass through his ears
                                        //This setter method is a void, because Student doesn't respond after being taught.

        this.knowledge = ears;          //Everything that enters to his ears becomes knowledge
    }

    public String talk(){   //However, Student responds with knowledge after being asked to talk()

        return knowledge;   //and the Student say the knowledge that was stored in him

    }

    public static void main(String[] args) {

        GetterSetterStudent Student = new GetterSetterStudent();  // Student is created

        Student.listen("For the LORD gives wisdom; from his mouth come knowledge and understanding -Pro. 2:6");

        System.out.println("The learn that ["+ Student.talk() + "]");

    }

}
