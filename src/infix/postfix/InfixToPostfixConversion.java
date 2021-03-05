/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 22-02-2021
 * Time: 10:18 AM
 * File: InfixToPostfixConversion.java
 * */

// ctrl + alt + L --> for code reformat

package infix.postfix;

import java.util.Stack;

public class InfixToPostfixConversion {
    public String infixToPostfixConversion(String infixString) {
        String postfix = "";
        Stack<Character> stack = new Stack<>(); // Diamond Syntax

        // Step 1.
        stack.push('(');
        infixString = infixString.concat(")");
        for (int i = 0; i < infixString.length(); i++) {

            // Step 2.
            char character = infixString.charAt(i);

            // Step 3.
            if (Character.isAlphabetic(character))
                postfix = postfix.concat("" + character);
                // postfix = postfix.concat(Character.toString(character));

                //Step 4.
            else if (character == '(')
                stack.push(character); // conversion of operand in its object is known as autoboxing process.

                // Step 5.
            else if (isOperator(character))
                if (stack.peek() != '(') {
                    while (!stack.empty()) {
                        if (precedence(stack.peek()) >= precedence(character)) {
                            postfix = postfix.concat("" + stack.pop());
                        } else {
                            stack.push(character);
                            break;
                        }
                    }
                } else {
                    stack.push(character);
                }
                // Step 6.
            else if (character == ')') {
                while (!stack.empty()) {
                    if (stack.peek() != '(') {
                        postfix = postfix.concat("" + stack.pop());
                    } else {
                        stack.pop();
                        break;
                    }
                }
            }
        }

        return postfix;
    }

    private int precedence(char operator) {
        int response = 0;
        switch (operator) {
            case '^':
                response = 3;
                break;
            case '/', '*':
                response = 2;
                break;
            case '+', '-':
                response = 1;
        }
        return response;
    }

    private boolean isOperator(char operator) {
        boolean response = false;
        switch (operator) {
            case '^':
            case '/', '*':
            case '+', '-':
                response = true;
        }

        return response;
    }


}
