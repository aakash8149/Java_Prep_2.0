package Flow_Controls_Loops;

import java.util.Scanner;
// Accept Numbers from the user until the user gives an Input which is a Multiple of 10 !!
public class break_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter the Number: ");
            int n = sc.nextInt();
            System.out.println(n);
            if (n%10 == 0) {
                break;
            }
        } while(true); System.out.println("Sorry U entered a Multiple of 10 !!");
        sc.close();
    }
}
