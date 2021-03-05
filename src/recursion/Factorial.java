/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 03-03-2021
 * Time: 05:16 PM
 * File: Factorial.java
 * */

package recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static long fact(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }
}
