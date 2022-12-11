import java.util.Scanner;

public class maxarr {
    public static void main(string[] args)
    {
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
        int A=x[0];
       for(int q=0; q<arr ; q++)
       {
            if (x[q]>A)
            A=x[q];
       } 
       system.out.println("The max is : " + A);
    }
    
}
