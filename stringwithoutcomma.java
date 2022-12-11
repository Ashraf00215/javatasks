import java.util.Scanner;
public class stringwithoutcomma {

    public static void main(String[] args) {
        system.out.println("Enter the string : ");
        Scanner sc = new Scanner(system.in);
        char[] arr = sc.nextchar;
        for (int i=0 ; i<arr.length ; i++)
        {
            if (arr[i]==",")
            arr[i]="";
        }
        system.out.println("the string without comma : " + arr);
        
    }
}
