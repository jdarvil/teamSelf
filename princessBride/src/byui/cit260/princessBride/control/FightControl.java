/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.control;

import byui.cit260.princessBride.exceptions.FightControlException;
import java.util.Scanner;
import java.util.Random;
import javax.swing.*;
/**
 *
 * @author Jason
 */
public class FightControl {

    public static void talkToInigo() throws FightControlException {
        //This block of code generates an array of ten sequential numbers between 1 and 100
		//This block also chooses a number from within the range as the magic number
		int guess = 0;
		//generate a random number between 1 and 100, excluding 0
		Random rn = new Random();
		int min = 1;
		int max = 90;
		int R = rn.nextInt(max-min) + min;
		System.out.println(R + "- This is the random number where the array starts");
        // create an array of numbers
        int[] fightInigoArray = new int[10];
        // populate the array        
		for (int i=0; i<fightInigoArray.length;i++){
			fightInigoArray[i] = i + R;
		}
		//This is where the random number from within the range is chosen
		int hisNumber = new Random().nextInt(fightInigoArray.length);
		hisNumber = fightInigoArray[hisNumber];
        //Generate random number from the array index and prohibit the number from being 0
        
        int i;
                		
        // For testing purposes to make sure it is generating a random number
        // uncomment this line
        
        System.out.println(hisNumber + "- This is the random number that Inigo picked");
        
        
        System.out.println("\nYou try to speak to him and explain"
                + "\nyour situation. He says if you do not want"
                + "\nto fight him, you must guess a number between"
                + "\none and ten. If you guess the number in five guesses"
                + "\nyou can get past him safely. If you fail, you will"
                + "have to FIGHT HIM!");
        
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("\nInigo Says: "
        		+ "Here are ten numbers.\n");
        
        for ( i=0; i<fightInigoArray.length; i++){
        	System.out.print(fightInigoArray[i]+ "|");
        }
        
        
        System.out.println("\nPlease guess a number between"
        		+ " the lowest and the highest:"
        		+ " You have five chances.");
        System.out.println("Number:");
        while (!keyboard.hasNextInt()){
        	System.out.println("Please enter a valid integer!");
        	keyboard.next();
                
        }
        
        int myNumber = keyboard.nextInt();
        	
        		
        	guess++;
        	
        	
        	
        	/// STUFF HAPPENS WHEN YOU GUESS WRONG        	

        	while (myNumber != hisNumber) 
                    {
                    System.out.println("Close...");
                    if (myNumber > hisNumber)
                        {
                    System.out.println("Try a lower number in this range.");
                    for( i=myNumber; i>hisNumber-2; i--)
                            {   
                            System.out.print(i - 1 + "|");
                            }
                        }

                    System.out.print("Enter a number between these two numbers: ");
                    while (!keyboard.hasNextInt()){
                    System.out.println("Please enter a valid integer!");
                    keyboard.next();
            }
                    myNumber = keyboard.nextInt();
                    if (myNumber <= 0 || hisNumber  > 100)
        		{
                       throw new FightControlException("Please enter a positive integer "
                        + "or a number less than 100.");
                        
                        }
                    guess++;
                    if (myNumber < hisNumber)
                        {
                    System.out.println("Nope...");
                    System.out.println("Higher.");
                    for( i=myNumber; i<hisNumber+2; i++)
                            {
                            System.out.print(i + 1 +" | ");
                            }
                        }   
                    }
                    if (guess > 3)
                            {
                            System.out.println(hisNumber);
                            System.out.println("You got my number, but took  ");
                            System.out.println( guess + " turns.");
                            FightControl.fightInigo();
                            
                            }

                    else
                    {
                    System.out.println(hisNumber);
                    System.out.print("You win after ");
                    System.out.println(guess + " guesses. I will join "
                                    + "you in your plight to save the Princess.");
                    }
    	
				  System.exit(0);
                               
}


                  

        


    public static void fightInigo() {
        System.out.println("Stub Function - Prepare to Die!");
    }
}

           
        
    