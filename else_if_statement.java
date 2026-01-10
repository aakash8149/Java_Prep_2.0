package Conditional_Statements;

import java.util.Scanner;

public class else_if_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are an Adult !");
        } else if(age >=13 && age < 18){
            System.out.println("You are a Teenager !");
        }
        else {
            System.out.println("Child, Not Eligible Right now !!!");
        }
        sc.close();
    }
}
