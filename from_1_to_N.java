package Flow_Controls_Loops;
import java.util.*;

public class from_1_to_N {
    public static void main(String[] args) {
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int numb = sc.nextInt();

        while (counter<=numb) {
            System.out.print(counter+" ");
            counter++;
        }
        sc.close();
    }
}
