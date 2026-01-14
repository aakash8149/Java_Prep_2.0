package Conditional_Statements;

import java.util.Scanner;

//Write a Java program to get a number from the user and print whether it is positive or negative
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        String ans = (num>=0 ? "Positive" : "Negative");
        System.out.println(ans);
        sc.close();
    }
}
