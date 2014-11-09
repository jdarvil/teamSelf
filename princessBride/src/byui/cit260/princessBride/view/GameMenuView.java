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
public class GameMenuView extends View{
    public GameMenuView(){
        super("\n" +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+              Game Menu               +" +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+ B - search for Buttercup             +" +
            "\n+ G - show the Game menu               +" +
            "\n+ I - look at your Inventory           +" +
            "\n+ S - Save game and continue playing   +" +
            "\n+ E - Exit to Main Menu                +" +
            "\n++++++++++++++++++++++++++++++++++++++++");
    }

@Override
    public void doAction(String value) {
        
        char selection = ' ';
        selection = value.charAt(0);
        
        switch (selection){
            case 'B':
                this.chaseButtercup();
                break;
            case 'G':
                this.showMenu();
                break;
            case 'I':
                this.inventoryLook();
                break;
            case 'S':
                this.saveGameContinuePlay();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    }
}

    private void chaseButtercup() {
        SearchMenuView searchMenu = new SearchMenuView();
        searchMenu.display();
    }

    private void showMenu() {
        System.out.println("\n showMenu called");
    }

    private void inventoryLook() {
        System.out.println("\n inventoryLook called");
    }

    private void saveGameContinuePlay() {
        System.out.println("\n saveGameContinuePlay called");
    }
}
