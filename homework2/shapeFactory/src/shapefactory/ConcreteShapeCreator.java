/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapefactory;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ConcreteShapeCreator extends ShapeCreator {
    public Shape createShape(){
     Scanner in = new Scanner(System.in);
     System.out.println("Enter the type of shape");
     String type = in.nextLine();		
    if(type.equalsIgnoreCase("TRIANGLE")){
       return new Triangle();
       
    } else if(type.equalsIgnoreCase("SQUARE")){
       return new Square();
    }
    else {
        return null;
    }
    }
}
