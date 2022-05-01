import java.util.Scanner; 

class Addition {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in); 
    System.out.println("Type a number:");
    int x = sc.nextInt(); 

    System.out.println("Type another number:");
    int y = sc.nextInt();

    int sum = x + y;  
    System.out.println("Addition is: " + sum); 
  }

        }
    
  