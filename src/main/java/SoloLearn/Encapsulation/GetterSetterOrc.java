package SoloLearn.Encapsulation;

public class GetterSetterOrc {
    private int height;

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public static void main(String[] args) {
        GetterSetterOrc orc1 = new GetterSetterOrc();
        orc1.setHeight(7);
        System.out.println("The Height of your Orc is: " + orc1.getHeight());

        GetterSetterOrc orc2 = new GetterSetterOrc();
        orc2.setHeight(12);
        System.out.println("The Height of your Orc is: " + orc2.getHeight());
    }
}
