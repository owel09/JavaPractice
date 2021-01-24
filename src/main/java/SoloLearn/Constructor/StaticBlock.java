package SoloLearn.Constructor;

public class StaticBlock {
    static int num;
    static  String myStr;

    static {
        num = 9;
        myStr = "owel";
    }

    public static void main(String[] args) {
        System.out.println(StaticBlock.num + " is " + myStr + " favorite number");
    }
}
