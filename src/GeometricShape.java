
import java.util.*;
abstract class GeometricShape{
    final double PI=3.14;
    //	abstract public void areaC(int radius);
//	abstract public void areaT(int A,int b,int c);
//	abstract public void areaR(int l ,int b);
    abstract public void area();
    abstract public void perimeter();

}
class circle extends GeometricShape{
    Scanner sc=new Scanner(System.in);

    double radius=sc.nextDouble();
    public void area() {
        //radius=sc.nextDouble();
        System.out.println("Area of circle is :"+ PI*radius*radius );
    }

    public void perimeter() {
        System.out.println("Perimeter of circle is : "+2*PI*radius);
    }
}
 class Triangle extends GeometricShape{

    Scanner sc=new Scanner(System.in);
    //System.out.println("Enter side1 :");
    double side1=sc.nextDouble();
    double side2=sc.nextDouble();
    double side3=sc.nextDouble();


    double s;
    public void area() {
        //radius=sc.nextDouble();
        s = (side1+ side2 + side3)/2;
        System.out.println("Area of Triangle is :"+Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)) );
    }

    public void perimeter() {
        System.out.println("Perimeter of Traingle is : "+(side1+side2+side3));


    }
}

class  Rectangle extends GeometricShape{
    Scanner sc=new Scanner(System.in);
    //System.out.println("Enter side1 :");
    int length=sc.nextInt();
    int breadth=sc.nextInt();

    public void area() {
        //radius=sc.nextDouble();

        System.out.println("Area of Rectangle is :"+(length*breadth));
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle is : "+2*(length+breadth));


    }
}


class TestGeometricShape {
    public static void main(String args[]) {
        System.out.println("Enter Radius :");
        circle c=new circle();
        c.area();
        c.perimeter();
        System.out.println("-------------------------------------------");
        System.out.println("Enter side1 side2 side3 :");
        Triangle triangle=new Triangle();
        triangle.area();
        triangle.perimeter();
        System.out.println("--------------------------------------------");
        System.out.println("Enter length and breadth : ");
        Rectangle rect=new Rectangle();
        rect.area();
        rect.perimeter();
        System.out.println("------------------------------------------");
    }

}
/*
 * Enter Radius :
4
Area of circle is :50.24
Perimeter of circle is : 25.12
-------------------------------------------
Enter side1 side2 side3 :
1.0 2.0 3.5
Area of Triangle is :NaN
Perimeter of Traingle is : 6.5
--------------------------------------------
Enter length and breadth :
2
3
Area of Rectangle is :6
Perimeter of Rectangle is : 10
------------------------------------------
 */
/*

*Enter Radius :
        4
        Area of circle is :50.24
        Perimeter of circle is : 25.12
        -------------------------------------------
        Enter side1 side2 side3 :
        1.0 2.5 4.5
        Area of Triangle is :NaN
        Perimeter of Traingle is : 8.0
        --------------------------------------------
        Enter length and breadth :
        3
        4
        Area of Rectangle is :12
        Perimeter of Rectangle is : 14
        ------------------------------------------
*/