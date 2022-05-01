import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in); {
            System.out.println("Enter no. - ");
            int num = sc.nextInt();
            if (num<0)
            {
                System.out.println("Negative");
            }
            if (num >0)
            {
            System.out.println("Positive");
            }
        }

         
        
    }
    
}
