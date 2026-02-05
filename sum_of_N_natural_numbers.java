package Flow_Controls_Loops;

import java.util.Scanner;

public class sum_of_N_natural_numbers {
    public static void main(String[] args) {
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int numb = sc.nextInt();
        int sum = 0;

        while (counter<=numb) {
            sum = sum + counter; // sum += counter;
            counter++;
        }
        System.out.println("The sum of N Natural Numbers is: "+sum);
        
        sc.close();
    }
}
