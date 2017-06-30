/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package variantb.three;

import java.util.Scanner;

/**
 *
 * @author SLAVA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        System.out.print("a = ");
        a = scan.nextDouble();
        System.out.print("b = ");
        b = scan.nextDouble();
        System.out.print("c = ");
        c = scan.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0)
            System.out.println("Корней нет!");
        else if (discriminant == 0) {
            double x = (-b) / (2 * a);
            System.out.println("x = " + x);
        } else {
            double x1 = (-b+Math.sqrt(discriminant))/(2*a);
            double x2 = (-b-Math.sqrt(discriminant))/(2*a);
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
 
    }
}
