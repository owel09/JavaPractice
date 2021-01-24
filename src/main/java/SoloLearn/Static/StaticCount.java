package SoloLearn.Static;

public class StaticCount {
    public static int count = 0;
    public int num;

    StaticCount(){
        count ++;
        num++;
    }

    public static void main(String[] args) {
        StaticCount counter = new StaticCount();
        System.out.println(count);      //1
        System.out.println(counter.num);//1


        StaticCount counter2 = new StaticCount();
        System.out.println(count);          //2 - nasave nya yun 1 na ginamit sa unang method at nagamit para magincremet
        System.out.println(counter2.num);   //1 - di kasi static yun num kaya di nya nasave yun 1

    }


}
