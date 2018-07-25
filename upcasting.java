import java.util.*;


class Rectangle
{
	
        double length,breadth,height;
        Rectangle()
        {
            
        }
        Rectangle(double l,double b, double h)
        {
            length=l;
            breadth=b;
            height=h;
        }
        void volume()
        {
            double vol;
            vol=length*breadth*height;
            System.out.println("The volume is "+vol);
            
        }
}
class cube extends Rectangle
{
    cube(double x,double y, double z)
    {
        super(x,y,z);
    }
    void volume()
    {
        double vol;
        vol=length*length*length;
        System.out.println("The volume is "+vol);
    }
}
 class pyramid extends Rectangle
{
    pyramid(double x,double y, double z)
    {
        super(x,y,z);
    }
    void volume()
    {
        double vol;
        vol=(length*breadth*height)/2;
        System.out.println("The volume is "+vol);
    }
}
public class upcasting
{
    public static void main(String[] args)
    {
        double x,y,z;
        Scanner c=new Scanner(System.in);
        System.out.println("Enter the length:");
        x=c.nextDouble();
        System.out.println("Enter the breadth:");
        y=c.nextDouble();
        System.out.println("Enter the height:");
        z=c.nextDouble();
        Rectangle obj=new Rectangle(x,y,z);
        obj.volume();
        obj=new cube(x,y,z);
        obj.volume();
        obj=new pyramid(z,y,z);
        obj.volume();
    }
}