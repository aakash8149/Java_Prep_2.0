package Conditional_Statements;

import java.util.Scanner;

//Question: Has Fever or not !!
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        double temp = sc.nextDouble();

        if (temp>100) {
            System.out.println("You have Fever !! Take rest !!");
        }
        else{
            System.out.println("You don't have any fever, u r overacting !!!");
        }
        sc.close();

    }
}
