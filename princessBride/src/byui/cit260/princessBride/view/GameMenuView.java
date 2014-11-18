/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.view;

import byui.cit260.princessBride.control.GameControl;
import byui.cit260.princessBride.control.MapControl;
import byui.cit260.princessBride.model.InventoryItem;
import byui.cit260.princessBride.model.Location;
import byui.cit260.princessBride.model.Map;
import java.util.Scanner;
import princessbride.PrincessBride;

/**
 *
 * @author Daniel
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n++++++++++++++++++++++++++++++++++++++++"
                + "\n+              Game Menu               +"
                + "\n++++++++++++++++++++++++++++++++++++++++"
                + "\n+ B - search for Buttercup             +"
                + "\n+ G - show the Game menu               +"
                + "\n+ I - look at your Inventory           +"
                + "\n+ S - Save game and continue playing   +"
                + "\n+ E - Exit to Main Menu                +"
                + "\n++++++++++++++++++++++++++++++++++++++++");
    }

    @Override
    public void doAction(String value) {

        char selection = ' ';
        selection = value.charAt(0);

        switch (selection) {
            case 'B':
                this.chaseButtercup();
                break;
            case 'V':
                this.displayMap();
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
        //get the sorted list of inventory items for the current game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();

        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t"
                + "Required" + "\t"
                + "In Stock");

        //for each inventory item
        for (InventoryItem inventoryItem : inventory) {
            //DISPLAY the description, the required amount and amount in stock
            System.out.println(inventoryItem.getInventoryType() + "\t   "
                    + inventoryItem.getRequiredAmount() + "\t   "
                    + inventoryItem.getQuantityInStock());
        }
    }

    private void saveGameContinuePlay() {
        System.out.println("\n saveGameContinuePlay called");
    }

    public void displayMap() {
        //get the map locations from the current game
        Location[][] locations = PrincessBride.getCurrentGame().getMap().getLocations();  
        
        double rowCount = Map.rowCount;
        double columnCount = Map.columnCount;
     
        
        
         
        
        //DISPLAY title
        System.out.println("Map");
        //DISPLAY row of column numbers
        System.out.print("   "); 
        for (int j = 0; j < columnCount; j++) {
            System.out.print("   " + j);
        }
        //DISPLAY row divider
        System.out.print("\n---------------------");   
        //FOR every row in map  
        for (int i = 0; i < rowCount; i++) {
           
            //DISPLAY row number
            System.out.print("\n" + i + " | ");
            //FOR every column in row
            for (int j = 0; j < columnCount; j++) {
                //DISPLAY column divider
               // System.out.print("|");
                //location = location[row][column]
                Location location = locations[i][j];
                //IF location has been visited
                if (location.visited) {
                    //DISPLAY the map symbol for location
                    //System.out.print("~~~");   
                    System.out.print(locations[i][j].getScene().getMapSymbol());
                }
                else {
                //DISPLAY " ?? "
                System.out.print(" ?? ");
                }
                //DISPLAY ending column divider
                System.out.print("|");
            }
           
        }
            //Display ending row divider
            System.out.println("\n---------------------");
    }
}