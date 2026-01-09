import java.util.Scanner;

public class variable_sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The SUM of the two numbers are: " + sum);
        sc.close();
    }
}
