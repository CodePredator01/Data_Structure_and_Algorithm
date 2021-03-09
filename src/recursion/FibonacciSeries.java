/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 09-03-2021
 * Time: 06:43 AM
 * File: FibnocciSeries.java
 * */

package recursion;

public class FibonacciSeries {
    static int a = 0;
    static int b = 1;
    static int sum = 0;

    public static void main(String[] args) {
        FibonacciSeries fibonacci = new FibonacciSeries();
        System.out.println(a);
        System.out.println(b);
        fibonacci.withRecursion(10);
    }

    public void withoutRecursion(int num) {
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            System.out.println(a);
            sum = a + b;
            a = b;
            b = sum;

        }
    }

    public void withRecursion(int num) {
        if (num > 0) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
            withRecursion(num - 1);
        }
    }
}
