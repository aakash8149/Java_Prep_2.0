package Flow_Controls_Loops;

public class square_pattern {
    public static void main(String[] args) {
        
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //or
        System.out.println("Another Approch !");

        for(int lines=1; lines<=4; lines++){
            System.out.println("* * * *");
        }

        //Using While Loop
        System.out.println("Using While Loop !");
        int a = 1;
        while (a<=4) {
            System.out.println("* * * *"); a++;
        }
    }
}
