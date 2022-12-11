public class triangle {
    private double height;
    private double base;
    public void area(double h , double b)
    {
         height= h;  
         base = b;  
        int area = (base*height)/2;  
        system.out.println("Area of Triangle is : " + area);
    }
    public void perimeter(double b)
    {
         base=b; 
        int perimeter= base*3;  
        system.out.println("perimeter of Triangle is : " + perimeter);
    }
}
