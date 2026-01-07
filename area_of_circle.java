import java.util.Scanner;

public class area_of_circle {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the circle: ");
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius; //The 3.14f --> Here the f at last is given because Java normally considers decimal numbers as double !!
        System.out.println("The Area of the Circle is: " + area);
    }
    
}
