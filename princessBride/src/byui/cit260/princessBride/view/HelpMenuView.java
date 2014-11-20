/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.view;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class HelpMenuView extends View {
    public HelpMenuView(){
     super("\n" +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+              Help Menu               +" +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+ G - Game play                        +" +
            "\n+ I - Inigo Mantoya the Swordsman      +" +
            "\n+ F - Fezzik the Giant                 +" +
            "\n+ V - Vizzini the Brains               +" +
            "\n+ S - The fireSwamp                    +" +
            "\n+ P - The Pit of Despair               +" + 
            "\n+ M - Miracle Max                      +" +
            "\n+ C - Storming the Castle              +" +
            "\n+ Z - The maZe                         +" +
            "\n+ E - Exit to Main Menu                +" +
            "\n++++++++++++++++++++++++++++++++++++++++");
    }
     
@Override
    public void doAction(String value) {
        
        char selection = ' '; 
        selection = value.charAt(0);
        
        switch (selection){
            case 'G':
                this.gamePlayHelpView();
                break;
            case 'I':
                this.inigoHelpView();
                break;
            case 'F':
                this.fezzikHelpView();
                break;
            case 'V':
                this.vizziniHelpView();
                break;
            case 'S':
                this.fireSwampHelpView();
                break;
            case 'P':
                this.pitOfDispairHelpView();
                break;
            case 'M':
                this.miracleMaxHelpView();
                break;
            case 'C':
                this.stormingTheCastleHelpView();
                break;
            case 'Z':
                this.mazeHelpView();
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    /* Instructor: 
     * Each of these functions needs to display the appropriate help text 
     */
    private void gamePlayHelpView() {
        System.out.println("\n gamePlayHelpView called");
    }

    private void inigoHelpView() {
        System.out.println("\n inigoHelpView called");
    }

    private void fezzikHelpView() {
        System.out.println("\n fezzikHelpView called");
    }

    private void vizziniHelpView() {
        System.out.println("\n vizziniHelpView called");
    }

    private void fireSwampHelpView() {
        System.out.println("\n fireSwampHelpView called");
    }

    private void pitOfDispairHelpView() {
        System.out.println("\n pitOfDispairHelpView called");
    }

    private void miracleMaxHelpView() {
        System.out.println("\n miracleMaxHelpView called");
    }

    private void stormingTheCastleHelpView() {
        System.out.println("\n stormingTheCastleHelpView called");
    }

    private void mazeHelpView() {
        System.out.println("\n mazeHelpView called");
    }
    
}
