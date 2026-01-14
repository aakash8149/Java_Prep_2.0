package Conditional_Statements;

import java.util.Scanner;

//Write a Java program to input week number(1-7) and print day of week name using switch case
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the week Number [1-7]: ");
        int week_numb = sc.nextInt();

        switch (week_numb) {
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");
                    break;
            case 3: System.out.println("Wednesday");
                    break;
            case 4: System.out.println("Thursday");
                    break;
            case 5: System.out.println("Friday");
                    break;
            case 6: System.out.println("Saturday");
                    break;
            case 7: System.out.println("Sunday");
                    break;
        
            default: System.out.println("Please Between 1 and 7");
                    break;
        }
        sc.close();

    }
}
