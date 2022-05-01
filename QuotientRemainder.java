import java.util.Scanner;
public class QuotientRemainder {

    public static void main(String[] args) {
        System.out.println("Enter Dividend.");
         Scanner sc = new Scanner(System.in);
          int first = sc.nextInt();
          System.out.println("Enter Divisor ");
          int second = sc.nextInt();


     int Quotient = first / second ;
     int Remainder= first % second ;
    
     System.out.println("Quotient = " + Quotient);
     System.out.println("Remainder = "+ Remainder);
     
        
    }
  }