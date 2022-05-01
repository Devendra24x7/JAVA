import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) 
    {   int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. - ");
        int num=sc.nextInt();
        int fact=1;
        for(i=1;i<=num;i++)
        {
    
        fact = fact*i;
        }
        System.out.println("factorial is " + fact);
    }
}