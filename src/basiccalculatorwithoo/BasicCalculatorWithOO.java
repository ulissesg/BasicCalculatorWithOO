/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basiccalculatorwithoo;

import java.util.Scanner;
import operands.Division;
import operands.Multiplication;
import operands.Subtraction;
import operands.Sum;

public class BasicCalculatorWithOO{
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        double num1 = 0, num2 = 0;
        char operation = 0;
        int option = 0;
        String op;
                
        while (option == 0){
            inputMath(num1, num2, operation);
            System.out.println("Wanna do another operation ?"); 
            op= input.next();
            if (op.equals("no")) option = 1;
        }
        
        
    }
    
    static void inputMath(double num1, double num2, char operation){
        
        
        System.out.println("Type a number:");
        num1 = input.nextDouble();
        System.out.println("Type an operation (+  -  *  / )");
        operation = input.next().charAt(0);
        System.out.println("Type a number:");
        num2 = input.nextDouble();
        
        doMath(num1, num2, operation);
    }
    
    static void doMath (double num1, double num2, char operation){
        if (operation == '+'){
            Sum sum = new Sum();
            sum.calculate(num1, num2);
        }else if (operation == '-'){
            Subtraction sub = new Subtraction();
            sub.calculate(num1, num2);
        }else if (operation == '/'){
            Division division = new Division();
            division.calculate(num1, num2);
        }else if (operation == '*'){
            Multiplication multi = new Multiplication();
            multi.calculate(num1, num2);
        }
    }
    
}
