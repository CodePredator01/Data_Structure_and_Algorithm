/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 06-02-2021
 * Time: 07:32 PM
 * File: Pair.java
 * */

package simplePrograms;

public class Pair<X, Y> {
    X x;
    Y y;
    public Pair(X x, Y y){
        this.x = x;
        this.y = y;
    }
    public void getDescription(){
        System.out.println(x + " " + y);
    }
}
