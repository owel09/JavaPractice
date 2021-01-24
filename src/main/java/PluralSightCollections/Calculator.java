package PluralSightCollections;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 *Created by owel on 22/01/2020 7:23 AM
 */
public class Calculator
{


    //Bakit naka-final yung argument?
    // https://stackoverflow.com/questions/4162531/making-java-method-arguments-as-final
    public int  evaluate (final String input)

    {
        //double ended queue declaration using ArrayDeque implementation
        final Deque<String> stack = new ArrayDeque<>();

        //splitting the input using split method and declare as tokens
        final String[] tokens = input.split(" ");

        //for each token put it in the stack
        for(String token : tokens)
        {
            stack.add(token);
        }

        while (stack.size() > 1)
        {
            //Integer.parseInt wraping the String and converting it to int
            final int left = Integer.parseInt(stack.pop());
            final String operator = stack.pop();
            final int right = Integer.parseInt(stack.pop());

            int result = 0;

            switch (operator)
            {
                case "+":
                    result = left + right;
                    break;

                case "-":
                    result = left - right;
                    break;
            }

            //push the result back to the stack
            //String.valueOf converting the int into String
            stack.push(String.valueOf(result));
        }

        return Integer.parseInt(stack.pop());
    }
}

