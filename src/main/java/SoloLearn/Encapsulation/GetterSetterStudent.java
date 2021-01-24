package SoloLearn.Encapsulation;

/*
setter muna yun tinatawag bago yun getter kasi yun getter yun
tagasalo at may return
 */

public class GetterSetterStudent {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        GetterSetterStudent student = new GetterSetterStudent();
        student.setName("Owel Laguitan");

        System.out.println(student.getName());
    }
}
