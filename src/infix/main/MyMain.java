/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 22-02-2021
 * Time: 11:23 AM
 * File: MyMain.java
 * */

package infix.main;

import infix.postfix.InfixToPostfixConversion;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Infix String : ");
        String infixString = sc.next();
        InfixToPostfixConversion convertor = new InfixToPostfixConversion();
        String postfix = convertor.infixToPostfixConversion(infixString);
        System.out.println("postfix : " + postfix);
    }
}
