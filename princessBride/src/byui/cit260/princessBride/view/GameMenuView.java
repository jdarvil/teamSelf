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
class GameMenuView {
    private final String MENU = "\n" +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+              Game Menu               +" +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+ B - search for Buttercup             +" +
            "\n+ G - show the Game menu               +" +
            "\n+ I - look at your Inventory           +" +
            "\n+ S - Save game and continue playing   +" +
            "\n+ E - Exit to Main Menu                +" +
            "\n++++++++++++++++++++++++++++++++++++++++";
   
    void displayMenu() {
         char selection = ' ';
        do {
            
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        } while (selection != 'E');
    }

    private String getInput() {
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            System.out.println("Enter your menu choice.");
            input = keyboard.nextLine();
            input = input.trim();
            
            if(input.length() < 1) {
                System.out.println("Invaild Name - The name must not be blank");
                continue;
                }
            break;
        }
        
        return input;
    }

    private void doAction(char choice) {
        
        switch (choice){
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
        System.out.println("\n chaseButtercup called");
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
