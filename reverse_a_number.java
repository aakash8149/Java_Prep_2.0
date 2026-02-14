package Operators;

public class reverse_a_number {
    public static void main(String[] args) {
        int number = 15092003;
        while(number>0){
        int last_digit = number%10;
        System.out.print(last_digit+" ");
        number/= 10;
        }
    }
}
