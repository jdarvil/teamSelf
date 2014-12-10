/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.view;

import byui.cit260.princessBride.control.ProgramControl;
import byui.cit260.princessBride.model.Player;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class StartProgramView extends View{

    public StartProgramView() {
        super("\n\n *****************************************************************"
      + "\n * Princess Buttercup has been kidnpped right before she was       *"
      + "\n * doomed to marry the evil Prince Humperdink. Princess Buttercup  *"
      + "\n * mysteriously disappeared. You will face giants, fight swordsman *"
      + "\n * escape kidnappers, torturers and vile swamps in order to save   *"
      + "\n * your true love.                                                 *"
      + "\n *****************************************************************"
      + "\n *                 Welcome to the Princess Bride                 *"       
      + "\n*****************************************************************"
      + "\n\nEnter the player's name"
       );
    }
    
    @Override
    public void doAction(String value) {
    
    
        
        
       String playersName = value.trim();
            
            if(playersName.length() < 1) {
                System.out.println("Invaild Name - The name must not be blank");
                return;
                }
            
        
        Player player = ProgramControl.createPlayer(playersName);
        
        this.displayWelcomeMessage(player);
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
                
       
        
    }

  

   

   

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n *****************************************************************\n");
        System.out.println("**********\t Welcome to the game " + player.getName());      
        System.out.println("**********\t Have fun storming the castle!");
        System.out.println("\n *****************************************************************");
       
    }

    

      
    
}
               
    
    
    
     
    
    
