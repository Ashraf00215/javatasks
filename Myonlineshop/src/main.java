import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <product> arr = new ArrayList<product>();
        double totalprice =0;
        System.out.println(" create new book ? 1)yes 2)no ");
        int x = sc.nextInt();
        if (x==1)
        {
            System.out.println(" what is book type? 1)children 2)Cartoon");
            int y = sc.nextInt();
            if (y==1)
            {
                childrenbook Nbook = new childrenbook();
                System.out.println(" Enter its name : ");
                String w=sc.nextLine();
                Nbook.setBookname(w);
                System.out.println(" Enter its price : ");
                int e=sc.nextInt();
                Nbook.setPrice(e);
                arr.add(Nbook);
            }
            else if (y==2)
            {
                Cartoon Nbook = new Cartoon();
                System.out.println(" Enter its name : ");
                Nbook.setBookname(sc.nextLine());
                System.out.println(" Enter its price : ");
                Nbook.setPrice(sc.nextInt());
                arr.add(Nbook);
            }
        }
        else {
            System.out.println(" ok,back again ");
        }
        
        System.out.println(" show total price ?");
        String z = sc.nextLine();
        if (z=="yes")
        {
        for(int i=0 ; i<arr.size(); i++)
            {
                totalprice +=arr.get(i).getPrice();   
            }
        System.out.println(" total price is : " + totalprice);
        }
        else{
            System.out.println("ok,back again ");
        }
        sc.close();
    }
    
}
