import java.util.*;
import java.lang.Math;
class XYpoint{
	public int x;
	public int y;
	
	public XYpoint(int x, int y)
	{
          this.x=x;
          this.y=y;
        }

        public XYpoint()
        {
          this(0,0);
         }

        public String toString()
        {
          return "("+this.x+","+this.y+")";
         }
        public boolean equals( XYpoint that)
        {
          return (this.x == that.x) && (this.y == that.y);
        }
        public double distanceTo( XYpoint that)
        {
          return Math.sqrt(Math.pow((this.x-that.x),2) + Math.pow((this.y - that.y), 2));
         }
}
public class order
{
	// ���α׷����� 
	public static void main( String[] args ) 
	{
            Scanner scan = new Scanner(System.in);
            System.out.print("x��ǥ�� �Է��ϼ���: ");
                  int x = scan.nextInt();
           System.out.print("y��ǥ�� �Է��ϼ���: ");
                  int y = scan.nextInt();

           XYpoint point = new XYpoint(x, y);
           XYpoint origin = new XYpoint();

            if (origin.equals(point))
             {
               System.out.println("�����Դϴ�");
                   }
                   else
                   {
                      System.out.println(origin+"��"+point+"������ �Ÿ��� "+point.distanceTo(origin)+"�Դϴ�");
             }

           
	}
}



                