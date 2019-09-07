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
public class Division extends Operation{

    @Override
    public void calculate(double num1, double num2) {
        try {
            result = num1 / num2;
            if (Double.isInfinite(result)) throw new ArithmeticException();
            System.out.println("Division result: " 
                    + String.format("%.2f", result));
            
        } 
        catch(ArithmeticException e){
            System.err.println("Division by zero !");
        }
        catch (Throwable e) {
            System.err.println("Error !");
        }
        
    }
    
}   
