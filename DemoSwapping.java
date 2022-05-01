import java.util.Scanner;
public class DemoSwapping{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First no.");
        int x = sc.nextInt();
        System.out.println("Enter Second no.");
        int y = sc.nextInt();
        System.out.println("Before Swap" +" "+ x +" "+y);

        x = x - y;
        y = x + y;
        x = y - x;
        
        //float swap = (x||y <0)? Math.abs(x||y);

        System.out.println("After Swap" + " "+ x +" "+y);
        
    }
}