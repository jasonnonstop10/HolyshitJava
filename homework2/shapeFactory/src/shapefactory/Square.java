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
public class Square extends Shape {

    @Override
    public void display() {
        Scanner size = new Scanner(System.in);
        Scanner shape = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = size.nextInt();
        System.out.println("Enter the shape to be printed");
        char shp = shape.next().charAt(0);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(shp);
            }
            System.out.println();
        }
    }
}
