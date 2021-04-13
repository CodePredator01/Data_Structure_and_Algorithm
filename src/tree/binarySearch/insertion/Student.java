/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 22-03-2021
 * Time: 10:55 AM
 * File: Student.java
 * */

package tree.binarySearch.insertion;

public class Student implements Comparable {
    private int rollNo;

    // How we make this method for name
    @Override
    public int compareTo(Student o) {
        return this.rollNo - o.rollNo;
    }



    /*@Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
        // checking both objects are jeans
        else if (o instanceof Student) {
            //  type cast
            Student a = (Student) o;
            return this.rollNo - a.rollNo;
        }else {
            return 0;
        }
    }*/
}
