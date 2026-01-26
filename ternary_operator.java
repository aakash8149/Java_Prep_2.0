package Conditional_Statements;
//Ternary operator Syntax: variable = condition? statementl : statement2;
public class ternary_operator {
    public static void main(String[] args) {
        
        int num = 41;
        String type = ((num%2==0) ? "Even" : "Odd");
        System.out.println(type);
    }
}
