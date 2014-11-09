/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.view;
import byui.cit260.princessBride.control.GameControl;
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
                this.speakToInigo();
                break;
            case 'F':
                this.fightInigo();
                break;
            case 'R':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    }
    }
    

    private void speakToInigo() {
    GameControl.fightInigo(null);
    }
    

    private void fightInigo() {
    GameControl.talkToInigo(null);
    
    }
}
       
        
        
    
