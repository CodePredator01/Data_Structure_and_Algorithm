/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 11-02-2021
 * Time: 04:33 PM
 * File: Demo.java
 * */

package simplePrograms;

import java.util.Scanner;

public class TimeSegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int matchSticks = 0;
        int number = 0;
        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            switch (num) {
                case 0, 6, 9: matchSticks = 6;
                break;
                case 1: matchSticks = 2;
                break;
                case 2, 3, 5: matchSticks = 5;
                break;
                case 4: matchSticks = 4;
                break;
                case 7: matchSticks = 3;
                break;
                case 8: matchSticks = 7;
                break;
            }
            switch (matchSticks) {
                case 6: number = 6;
                    break;
                case 2: number = 2;
                    break;
                case 5: matchSticks = 5;
                case 4: matchSticks = 4;
                    break;
                case 7: matchSticks = 3;
                    break;
                case 8: matchSticks = 7;
                    break;
            }
            System.out.println(matchSticks);
        }
        sc.close();
    }
}
