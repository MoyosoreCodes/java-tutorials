import java.util.Scanner;
public class DivTest{

    public static void main(String[] args){
        int n;
        int b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to be divided: ");
        n = s.nextInt();
        System.out.print("Enter a number to divide with: ");
        b = s.nextInt();
        Div(n, b);

     }

    public static void Div(int a, int b){
       
            if (a % b == 0){
            System.out.println( a+ " is Divisible by "+ b+ "" );
        }
        else 
        {
            System.out.println(a+ " is not divisible by " + b+ "" );
        }

        }


}