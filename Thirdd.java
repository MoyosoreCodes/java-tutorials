import java.util.Scanner;
public class Thirdd{
    public static void main(String args[]){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("How many numbers should be in the array: \n");
        n = s.nextInt();
        int[] arr = new int[n];

        for(int j = 0; j < arr.length; j++){
            System.out.println("Enter the " + j + " number:  ");
            arr[j] = s.nextInt();
        }

        for(int i : arr){  
            System.out.println(i + ", ");  
            
        }

    }
}