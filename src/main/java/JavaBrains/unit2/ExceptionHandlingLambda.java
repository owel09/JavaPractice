package JavaBrains.unit2;

import java.util.function.BiConsumer;

/*LESSON 19
pinapakita dito kung paano nilalagyan ng exception yung lambda
 *Created by owel on 05/05/2020 5:50 AM
 */
public class ExceptionHandlingLambda {
    public static void main(String[] args) {

        int someNumbers [] = {1,2,3,4,5};
        int key = 0;

        process(someNumbers,key,(v,k) ->    //sa 3rd arg yung lambda na may try catch
                {
                    try {
                        System.out.println(v/k);
                    }catch (ArithmeticException e){
                        System.out.println("Arithmetic Exception encountered");
                    }
                }
                );
    }


    private static void process(int[] someNumbers, int key, BiConsumer<Integer,Integer> biConsumer) {
        //BiConsumer yun function interface na nag-accept ng lambda with 2 arg
        for (int i : someNumbers){
            biConsumer.accept(i,key); //gamit yung accept method pwede natin makuha yung i,key

        }
    }
}
