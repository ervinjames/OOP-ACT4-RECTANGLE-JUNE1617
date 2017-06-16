
package act4;


public class Rectangle {
    //Attributes
    double length;
    double width;
    //constructors*
    
    Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
        System.out.println("First Constructor Loaded");
 
    }
    Rectangle(double length ){
       this.length=length;
       this.width= 0.0 ;
      System.out.println("Second Constructor Loaded");
 
   }
    
   Rectangle(double length , double width){
       this.length=length;
       this.width=width;
      System.out.println("Third Constructor Loaded");
 
   }
   
   double getLength(){
       return this.length;
   }

   double getWidth(){
       return this.width;
   }

   void setLength(double length) {
       this.length=length;  
   }
    
    void setWidth(double length) {
       this.width=width;  
   }
    public static void main(String[] args) {
        
    }
    //setter of width
    //proceedural method displayArea
    void displayArea(){
        double area= this.length * this.width;
        System.out.println(area);
    }
    //functional
    double display_Area()
    {
        double area = this.length * this.width;
        return area;
    }
    
    
}
