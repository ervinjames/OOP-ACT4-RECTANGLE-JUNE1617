
package act4;

public class RectangleDemo {
    
    public static void main (String [] args ) {
        //Class Instantiation
        Rectangle r1 = new Rectangle ();
        Rectangle r2 = new Rectangle (5.0);
        Rectangle r3 = new Rectangle (7.0,8.0);
        
        r1.displayArea();
        double area = r1.display_Area();
        System.out.println(area);
    }
}
