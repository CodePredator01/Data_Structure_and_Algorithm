package simplePrograms;


import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = new char[11];
        for (int i = 0; i < 11; i++) {
            if (ch[i] == 'h') {
                ch[0]++;
            }
            if (ch[i] == 'a') {
                ch[1]++;
            }
            if (ch[i] == 'c') {
                ch[2]++;
            }
            if (ch[i] == 'k') {
                ch[3]++;
            }
            if (ch[i] == 'e') {
                ch[4]++;
            }
            if (ch[i] == 'r') {
                ch[5]++;
            }
            if (ch[i] == 't') {
                ch[6]++;
            }
            int a = ch[0] / 2;
            int b = ch[1] / 2;
            int c = ch[4] / 2;
            int d = ch[5] / 2;
            int min = ch[0];
        }
    }
}
