/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operands;

/**
 *
 * @author ulisses
 */
public class Sum extends Operation{

    @Override
    public void calculate(double num1, double num2) {
        result = num1 + num2;
        System.out.println("Sum result: " 
                + String.format("%.2f", result));
    }
}
