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
        int randomNumber = new Random().nextInt(10) + 1;
        
        
        System.out.println("\nYou try to speak to him and explain"
                + "\nyour situation. He says if you do not want"
                + "\nto fight him, you must guess a number between"
                + "\none and ten. If you guess the number in three guesses"
                + "\nyou can get past him safely.");
        
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println(" ////////////////// ");
        System.out.println("If you lose, you will die.");
        System.out.println(" ////////////////// ");
        System.out.println();
        System.out.print("Enter a number from 1 to 10: ");
        int inputNumber = keyboard.nextInt();
        guess++;
        while (inputNumber != randomNumber) {
                 System.out.println();
                 System.out.println("Try again...");
                 System.out.print("Enter a number from 1 to 10: ");
                 inputNumber = keyboard.nextInt();
                         guess++;
                }
        
        System.out.print("You win after ");
        System.out.println(guess + " guesses.");
    }
        

    public static void fightInigo() {
        
        
        
}
}

        
        
        
        
        
        
        
        
        
        
        
        
        
