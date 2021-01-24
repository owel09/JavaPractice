package SoloLearn.Abstract;

public class SmartPhoneRunner {

    public static void main(String[] args) {
        SmartPhone apple = new SmartPhoneIphone();
        SmartPhone android = new SmartPhoneHuawei();

        apple.showConfig();
        android.showConfig();

    }
}
