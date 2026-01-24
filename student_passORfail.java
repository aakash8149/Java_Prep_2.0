package Conditional_Statements;

import java.util.Scanner;

public class student_passORfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Percentage(%): ");
        float marks = sc.nextFloat();
        
        if (marks >= 33) {
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL !!!");
        }

        // OR Using ternary Operators

        String type = marks>=33 ? "PASS":"FAIL";
        System.out.println(type);
        sc.close();
    }
}
