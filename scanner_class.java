import java.util.*;

public class scanner_class {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name:");
        String name = sc.next();

        System.out.println(name);
        System.out.print("Enter the Name2:");
        String name2 = sc.nextLine();
        System.out.println(name2);

    }
}
