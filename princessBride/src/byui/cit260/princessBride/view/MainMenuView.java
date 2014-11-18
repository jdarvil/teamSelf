/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.view;

import byui.cit260.princessBride.control.GameControl;
import byui.cit260.princessBride.control.ProgramControl;
import byui.cit260.princessBride.model.Player;
import java.util.Scanner;
import princessbride.PrincessBride;

/**
 *
 * @author Daniel
 */
public class MainMenuView extends View {
    public MainMenuView() {
    super("\n" +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+              Main Menu               +" +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+ N - New game                         +" +
            "\n+ L - Load the game                    +" +
            "\n+ S - Save the game                    +" +
            "\n+ H - Get help on how to play the game +" +
            "\n+ E - Exit                             +" +
            "\n++++++++++++++++++++++++++++++++++++++++");
   
    }
  

   
@Override
    public void doAction(String value) {
        char selection = ' '; 
        selection = value.charAt(0);
   
        switch (selection){
            case 'N':
                this.newGame();
                break;
            case 'L':
                this.loadGame();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'H':
                this.getHelp();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
            
        }
    }

    private void newGame() {

        GameControl.createNewGame(PrincessBride.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void loadGame() {
        System.out.println("\n*** loadGame called ***");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame called ***");
    }
    private void getHelp() {
        
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

       
    
    }

    
    
    

