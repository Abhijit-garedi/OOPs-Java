import java.util.*;
public class Exp2 {
    double length,width,area,perimeter;
    void readData()
    {
        Scanner S=new Scanner(System.in);
        System.out.println("enter length & width:");
        length=S.nextDouble();
        width=S.nextDouble();
    }

    void area()
    {
        area=(length*width);
        System.out.println("area is :" +area);
    }
    void perimeter()
    {
        perimeter=2*(length*width);
        System.out.println("perimeter is" +perimeter);

    }
}
class Rect{
    public static void main(String args[]){
        Exp2 x=new Exp2();
        x.readData();
        x.area();
        x.perimeter();
    }
}

/*OUTPUT
 * enter length & width:
2
4
area is :8.0
perimeter is16.0
 */
