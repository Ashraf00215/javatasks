public class circle {
   
    private double diameter;

    public void area(double d)
    {
        diameter=d;
        int area = 7*(diameter*diameter)/22;  
        system.out.println("Area of circle is : " + area);
    }
    public void lengthofcir(double d)
    {
        diameter = d; 
        int lengthofcir=2*diameter*7/22;  
        system.out.println("length of circle is : " + lengthofcir);
    }
}
