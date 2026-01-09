import java.util.Scanner;

public class product {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st No.: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd No.: ");
        int b = sc.nextInt();
        int product = a * b;
        System.out.println("The Product of two numbers are: " + product);
        sc.close();

    }
}
