import java.util.*;

public class type_Promotion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        char a = 'a';
        char b = 'b';
        System.out.println("a = " + (int)a);
        System.out.println("b = " + (int)b);
        System.out.println(b-a); //Type Promotion: From Char to int
        sc.close();
        

    }
}
