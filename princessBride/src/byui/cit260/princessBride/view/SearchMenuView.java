/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.view;
import byui.cit260.princessBride.control.FightControl;
import byui.cit260.princessBride.control.GameControl;
import byui.cit260.princessBride.exceptions.FightControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jason
 */
public class SearchMenuView extends View{
    public SearchMenuView(){
     super("\n" +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+ You have arrived at the top of the    " +
            "\nCliffs of Insanity. You are facing a    " +
            "\nSpaniard. He draws his sword and begins " +
            "\nto speak.                               " +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\nMy name is Inigo Montoya. You killed    " +
            "\nmy father. Prepare to Die!              " +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+ S - Speak in Inigo Montoya           +" +
            "\n+ F - Fight Inito Montoya              +" +
            "\n+ R - Return to the Ship               +" +
            "\n++++++++++++++++++++++++++++++++++++++++");
    }
     
@Override
    public void doAction(String value) {
        
        char selection = ' '; 
        selection = value.charAt(0);
        
        switch (selection){
            case 'S':
                {
            try {
                this.speakToInigo();
            } catch (FightControlException me) {
                System.out.println(me.getMessage());
            }
        }
                break;
            case 'F':
        {
            try {
                this.fightInigo();
            } catch (FightControlException me) {
                System.out.println(me.getMessage());
            }
        }
                break;
            case 'R':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    }
    }
    

    private void speakToInigo() throws FightControlException{
        // implement Exception Control - Jason Bullock Individual Assignment
       try {
            FightControl.talkToInigo();
        }
        catch (FightControlException me) {
            System.out.println(me.getMessage());
        }
        }
    
    

    private void fightInigo() throws FightControlException {
        FightControl.fightInigo();
    
    }
}