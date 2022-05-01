import java.util.Scanner; 

class FloatMultiply {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in); 
    System.out.println("Type a number:");
    float x = sc.nextFloat(); 

    System.out.println("Type another number:");
    float y = sc.nextFloat();

    float Multiply = x * y;  
    System.out.println("Multiply is: " + Multiply); 
  }

        }
    