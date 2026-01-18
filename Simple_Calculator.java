package Conditional_Statements;

import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the operation(+ - / * %): ");
        char ch = sc.next().charAt(0);
        System.out.print("Enter the Number: ");
        int numb1 = sc.nextInt();
        System.out.print("Enter the Number: ");
        int numb2 = sc.nextInt();

        switch(ch){
            case '+': int add = numb1 + numb2;
                        System.out.println(add);
                        break;
            case '-': int subs = numb1 - numb2;
                        System.out.println(subs);
                        break;
            case '*': int mul = numb1 * numb2;
                        System.out.println(mul);
                        break;
            case '/': int div = numb1 / numb2;
                        System.out.println(div);
                        break;
            case '%': int rem = numb1 % numb2;
                        System.out.println(rem);
                        break;
            default: System.out.println("Please select from these + - % / *");
        }
        sc.close();
    }
}
