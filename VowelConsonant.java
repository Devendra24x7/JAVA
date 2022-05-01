import java.util.Scanner;
public class VowelConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Character: ");

        char ch = sc.next().charAt(0);

        
    if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
        {
    System.out.print(ch+" is vowel");
        }
    else
        {
    System.out.print(ch+" is  consonant");
        }
    }
}