package Conditional_Statements;
import java.util.*;

public class income_tax_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Annual Income in Lakhs per Annum (LPA): ");
        float income = sc.nextFloat();

        if (income <= 400000) {
            System.out.println("No Tax, You are tax exempted !!");
        }
        else if(income > 400000 && income <= 1000000){
            System.out.println("You are under 20% Income Slab and your Income is: " + income*0.2);
        }
        else{
            System.out.println("You are under 30% Income Slab and your Income is: " + income*0.3);
        }
        sc.close();
    }
}
