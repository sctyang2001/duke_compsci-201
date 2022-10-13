import java.util.*;

public class ParathesesCompleter {
    public static void main(String[] args)
    {
        Stack<String> elements = new Stack<>();
        Stack<String> operator = new Stack<>();
        Stack<String> operand = new Stack<>();
        String []sx = StdIn.readAllStrings();
        String expression = new String();
        // Complete the JPA code here, see README on course website for problem description and instructions.

        for (int i=0; i<sx.length; i++)
            {
            if (sx[i].equals("*"))
                operator.push(sx[i]);
            else if (sx[i].equals("+"))
                operator.push(sx[i]);
            else if (sx[i].equals("-"))
                operator.push(sx[i]);
            else if (sx[i].equals("/"))
                operator.push(sx[i]);
            else if (sx[i].equals("sqrt"));
            else if (sx[i].equals(")"))
                {
                    String secondOperand = operand.pop();
                    String firstOperand = operand.pop();
                    String sign = operator.pop();

                    expression = "(" + firstOperand + sign + secondOperand + ")";

                    operand.push(expression);

                    elements.push(expression);

                    if (i == sx.length-1)
                    {
                        while (!operator.isEmpty())
                        {
                             secondOperand = operand.pop();
                             firstOperand = operand.pop();
                             sign = operator.pop();
                            expression =  firstOperand + sign + secondOperand ;
                            operand.push(expression);
                        }
                    }
                }
            else
                operand.push(sx[i]); 
            }
            System.out.println(expression);
        return;
    }

    public static void printStack (Stack<String> s)
    {
        if (s.isEmpty()) return;
        String item  = s.peek();
        s.pop();
        printStack(s);
        System.out.print(item +" ");
        s.push(item);
    }
}