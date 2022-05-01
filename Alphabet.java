import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if (Character.isAlphabetic(c)) {
            System.out.println(c + " is an alphabet.");
          }
          else {
            System.out.println(c + " is not an alphabet.");
          }
        }
      
    }

