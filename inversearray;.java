import java.util.Scanner;
public class inversearr {
     public static void main(String[] args) {
        
        system.out.println("Enter the size of array : ");
       Scanner sc= new Scanner(System.in);
       int arr =sc.nextInt();
       int[] x = new int [arr];
       system.out.println("Enter the number  : ");
       for (int i=0 ; i<x.length ; i++)
        {   
            system.out.println("Enter the number  : ");
            x[i]=sc.nextInt();
        }
        int a = 0;
        for (int q=0;q<x.length;q++)
        {
            a=x[q];
            x[q]=x[x.length-q];
            x[x.length-q]=a;
        } 


    }

    
}
