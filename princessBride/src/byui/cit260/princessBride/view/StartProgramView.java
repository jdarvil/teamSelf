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
public class StartProgramView {

    public void startProgram() {
    
        this.displayBanner();
        
        String playersName = this.getPlayersName();
        
        Player player = ProgramControl.createPlayer(playersName);
       
        
    }

    private void displayBanner() {
       System.out.println("\n\n *****************************************************************"
      + "\n * Princess Buttercup has been kidnpped right before she was       *"
      + "\n * doomed to marry the evil Prince Humperdink. Princess Buttercup  *"
      + "\n * mysteriously disappeared. You will face giants, fight swordsman *"
      + "\n * escape kidnappers, torturers and vile swamps in order to save   *"
      + "\n * your true love.                                                 *"
      + "\n *****************************************************************"
      + "\n *                 Welcome to the Princess Bride                 *"       
      + "\n*****************************************************************"
       ); 
    }

   

   private String getPlayersName() {
        boolean valid = false;
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            System.out.println("Enter the Players Name below");
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            if(playersName.length() < 1) {
                System.out.println("Invaild Name - The name must not be blank");
                continue;
                }
            break;
        }
        
        return playersName;
    }

      
    
}
               
    
    
    
     
    
    
