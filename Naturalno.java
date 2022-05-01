import java.util.Scanner;

public class Naturalno {
    public static void main(String[] args) {
        int i;
        int sum=0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int num = sc.nextInt();
        for(i =1;i<=num;++i)
        sum = sum + i;
        System.out.println("Sum is =" + sum);
    }
}
