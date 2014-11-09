/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.control;

import byui.cit260.princessBride.model.Player;

/**
 *
 * @author Daniel
 */
public class GameControl {
    
   public static void createNewGame(Player player){
       System.out.println("\n createNewGame called");
   
}
   public static void fightInigo(Player player){
       System.out.println("Called from GameControl class. You cannot fight Inigo yet");
       
   }
    public static void talkToInigo(Player player){
       System.out.println("Called from GameControl class. You cannot speak to Inigo yet");
   }   
}
