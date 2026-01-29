package Flow_Controls_Loops;

import java.util.Scanner;

// Display all the number entered by the user except multiple of 10
public class continue_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter your number: ");
            int num = sc.nextInt();
            sc.close();
            if (num%10 == 0) {
                continue;
            }
            System.out.println(num);

        } while(true); 
        
    }
}
