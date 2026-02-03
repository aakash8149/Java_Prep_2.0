package Flow_Controls_Loops;

import java.util.Scanner;

//Write a program that reads a set of integers, and then prints the sum of the even and odd integers...
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int number, even_sum = 0, odd_sum = 0; char choice;

        do{
            System.out.print("Enter the Number: ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                even_sum += number;
            }else{
                odd_sum += number;
            }

            System.out.print("Do you do want to Continue {Press Y/N}: ");
            choice = sc.next().charAt(0);
        } while(choice == 'Y' || choice == 'y');

        System.out.println("The Even Sum is : " + even_sum);
        System.out.println("The Odd Sum is : " + odd_sum);
        sc.close();

    }
}
