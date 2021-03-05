/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 03-03-2021
 * Time: 05:11 PM
 * File: Main.java
 * */

package recursion;

public class Multiplicity {
    public static void main(String[] args) {

    }

    public static int mul(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + mul(a, b - 1);
        }
    }
}
