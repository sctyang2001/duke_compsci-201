import java.util.*;

public class Parentheses
{
    public static void main(String[] args)
    {
        // Exercise 4.3.6 Parentheses
        // determine if the brackets in inpu match

        // Complete the JPA code here, see README on course website for problem description and instructions.
        Stack<Character> stack = new Stack<Character>();
        // string = StdIn.readString();
        char[] arr = StdIn.readString().toCharArray();
        char token;
        char lastToken;
        for (int i=0; i<arr.length; i++){
            token = arr[i];
            if (token == '('){
                if (stack.isEmpty()) stack.push(token);
                else{
                    lastToken = stack.pop();
                    if (lastToken == ')') continue;
                    else {
                        stack.push(lastToken);
                        stack.push(token);
                    }
                }
            }
            else if (token == ')'){
                if (stack.isEmpty()) stack.push(token);
                else{
                    lastToken = stack.pop();
                    if (lastToken == '(') continue;
                    else {
                        stack.push(lastToken);
                        stack.push(token);
                    }
                }
            }
            else if (token == '['){
                if (stack.isEmpty()) stack.push(token);
                else{
                    lastToken = stack.pop();
                    if (lastToken == ']') continue;
                    else {
                        stack.push(lastToken);
                        stack.push(token);
                    }
                }
            }
            else if (token == ']'){
                if (stack.isEmpty()) stack.push(token);
                else{
                    lastToken = stack.pop();
                    if (lastToken == '[') continue;
                    else {
                        stack.push(lastToken);
                        stack.push(token);
                    }
                }
            }
            else if (token == '{'){
                if (stack.isEmpty()) stack.push(token);
                else{
                    lastToken = stack.pop();
                    if (lastToken == '}') continue;
                    else {
                        stack.push(lastToken);
                        stack.push(token);
                    }
                }
            }
            else if (token == '}'){
                if (stack.isEmpty()) stack.push(token);
                else{
                    lastToken = stack.pop();
                    if (lastToken == '{') continue;
                    else {
                        stack.push(lastToken);
                        stack.push(token);
                    }
                }
            }
        }
        if (stack.isEmpty()) System.out.println("true");
        else System.out.println("false");
        return;
    }
}