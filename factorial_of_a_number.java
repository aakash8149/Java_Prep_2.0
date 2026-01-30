package Flow_Controls_Loops;

import java.util.Scanner;

public class factorial_of_a_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:  ");
        int n = sc.nextInt();
        
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial *= i; //factorial = factorial * i; 
        }
        System.out.println("Factorial: " + factorial);
        sc.close();
    }
}
