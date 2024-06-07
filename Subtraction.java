/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.subtraction;

import java.util.Scanner;

public class Subtraction {

    public static void main(String[] args) {
       Scanner save = new Scanner(System.in);
        int num1;
        int num2; 
        int ans;
        int Answer;  // users answer

        //  Ask the user to enter the first number 
        System.out.print("Enter the first number: \n"); 
        num1 = save.nextInt(); 

        // Ask the user to enter the second number 
        System.out.print("Enter the second number: \n"); 
        num2 = save.nextInt();
        
        // swapping numbers if num1 is less than number 2
        if (num1 < num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
           
        }
        

        // Calculate the subtraction 
        ans = num1 - num2; 
        
        System.out.println("-------------------");
        // Displaying the  question to the user 
        System.out.println( "What is " + num1 + " - " + num2 + "?"); 

       // Ask the user to enter the answer 
       System.out.print("Answer = "); 
       Answer = save.nextInt(); 

       // Check if the user's answer is correct 
       if (Answer == ans) { 
           System.out.println("Correct Answer ");
       }
             else{ 
                     System.out.println("Incorrect.  Please Try again.");
       } 
    } 
}
    

