/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.control;

import java.util.Scanner;
import java.util.Random;
import javax.swing.*;
/**
 *
 * @author Jason
 */
public class FightControl {

    public static void talkToInigo() {
        int guess = 0;
        // create an array of numbers
        int[] fightInigoArray = new int[10];
        int max = fightInigoArray[9];
        int min = fightInigoArray[0];
        System.out.println(max);
       //Generate random number from the array indexees and prohibit the number from being 0
        int inigosNumber = new Random().nextInt(fightInigoArray.length)+1;
        
                		
        // For testing purposes to make sure it is generating a random number
        // uncomment this line
        System.out.println(inigosNumber);

         
        
        System.out.println("\nYou try to speak to him and explain"
                + "\nyour situation. He says if you do not want"
                + "\nto fight him, you must guess a number between"
                + "\none and ten. If you guess the number in five guesses"
                + "\nyou can get past him safely. If you fail, you will"
                + "have to FIGHT HIM!");
        
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("\nInigo Says: "
        		+ "Here are ten numbers.\n");
        for(int i=0; i<10; i++)
        {
        	System.out.print(i+1 + " | ");
        
        }
        System.out.print("\nPlease guess a number between the lowest and the highest:");
        	int inputNumber = keyboard.nextInt();
        	guess++;
        	if (inputNumber <= 0){
                System.out.println("Please enter a positive integer");
                        }
            
            
        	while (inputNumber > inigosNumber) {
            System.out.println("Close...");
            System.out.println("Try a lower number in this range.");
            for(int i=0; i<inputNumber; i++)
            {
            	System.out.print(i+1 + " | ");
            
            }
            System.out.print("Enter a number between the lowest and highest: ");
            
            inputNumber = keyboard.nextInt();
                         guess++;
                         if (inputNumber <= 0){
                System.out.println("Please enter a positive integer");
                        }
                }
        	while (inputNumber < inigosNumber) {
                System.out.println("Nope...");
                System.out.println("Try a number in this range.");
                for(int i=inputNumber; i<10; i++)
                {
                	System.out.print(i+1 + " | ");
                
                }
                System.out.print("Enter a number between the lowest and highest: ");
                
                inputNumber = keyboard.nextInt();
                             guess++;
                             if (inputNumber <= 0){
                System.out.println("Please enter a positive integer");
                        }
        	}
        	
        
        if (guess > 3){
        	System.out.println("You got my number, but took too many turns."
        			+ "You aren't very good at this!");
                
        }
      
        else{ 
        
        System.out.print("You win after ");
        System.out.println(guess + " guesses. I will join "
        		+ "you in your plight to save the Princess.");
        }
    
        }

    public static void fightInigo() {
        System.out.println("Stub Function");
    }
           
        
    }