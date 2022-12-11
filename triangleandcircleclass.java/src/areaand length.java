import java.util.Scanner;

public class test {
    public static void main(String[] args)
    {   
        triangle t1 = new triangle();
        circle c1 = new circle();
       System.out.println("Enter 1 for triangle or 2 for circle : ");
       Scanner sc = new Scanner(system.in);
       int x=sc.nextInt();

       switch (x)
       {
        case 1:
        {
            System.out.println("Enter height and base :");
            int h=sc.nextInt();
            int b=sc.nextInt();
            t1.area(h, b);
            t1.perimeter(b);
        }
        break;
        case 2:
        {
            System.out.println("Enter the diameter:");
            int d=sc.nextInt();
            c1.area(d);
            c1.lengthofcir(d);
        }
        break;

       }





    }
}    