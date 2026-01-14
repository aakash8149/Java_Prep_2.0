package Conditional_Statements;

import java.util.Scanner;

public class largest_of_3_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the 3rd Number: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("This is the Largest of all: " + num1);
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("This is the Largest of all: " + num2);
        }
        else{
            System.out.println("This is the Largest of all: " + num3);
        }
        sc.close();

        /*  Another Approch --
        
        if(num1 >= num2 && num1 >= num3){
            sout("Num1 is Larger")
        }
        else if(num2 >= num3){
            sout("Num2 is larger")
        }
        else{
            sout("Num3 is the largest !")
        }
        
        */
    }
}
