package SoloLearn.InterfaceCalculator;

/*
 *Created by owel on 15/04/2020 9:14 AM
 */
public class SimpleCalculator implements Calculator
{
    private int ans;

    @Override
    public int add(int a, int b)
    {
        return a + b;
    }

    @Override
    public void add1(int a, int b)
    {
        System.out.println(a + "+" + b + "=" + (a + b));
    }


}
