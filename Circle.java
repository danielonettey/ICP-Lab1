package trial;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Daniel Nettey
 */

//This is a program designed to get the area and circumference of the 
//circle given the input
public class Circle {
    double radius;
    DecimalFormat f = new DecimalFormat("##.00");
    
    //Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    //Get the area of the circle 
    public String getCircum(){
        return f.format(radius * 2 * 3.14);
    }
    
    //Get the circumference of the circle 
    public String getArea(){
        return f.format(3.14 * radius *radius);
       
    }
    
    
    public static void main (String[] args){
        //Asks user for input
        Scanner scan = new Scanner(System.in);
        Double radius = scan.nextDouble();
        
        Circle newCirc = new Circle(radius);
        System.out.println("Circumfernce of circle is "+ newCirc.getCircum());
        System.out.println("Area of circle is "+ newCirc.getArea());
        
    }
}
