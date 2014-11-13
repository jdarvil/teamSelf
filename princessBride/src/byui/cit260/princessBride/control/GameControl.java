/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.control;
      
import byui.cit260.princessBride.model.Boulder;
import byui.cit260.princessBride.model.Game;
import byui.cit260.princessBride.model.Goblet;
import byui.cit260.princessBride.model.InventoryItem;
import byui.cit260.princessBride.model.Map;
import byui.cit260.princessBride.model.Player;
import byui.cit260.princessBride.model.TortureDevice;
import princessbride.PrincessBride;

/**
 *
 * @author Daniel
 */
public class GameControl {
    
   public static void createNewGame(Player player){
       Game game = new Game();
       PrincessBride.setCurrentGame(game);
       
       game.setPlayer(player);
       
       //create inventory list and save in game
       InventoryItem[] inventoryList = GameControl.createInventoryList();
       game.setInventory(inventoryList);
       
       Boulder[] boulder = GameControl.createBoulder();
       game.setBoulder(boulder);
       
       Goblet goblet = new Goblet();
       game.setGoblet(goblet);
       
       TortureDevice torturedevice = new TortureDevice();
       game.TortureDevice(torturedevice);
       
       Map map = MapControl.createMap();
       game.setMap(map);
       
     // Move actors to starting place in the map
       MapControl.moveActorsToStartingLocation(map);
   }

    private static InventoryItem[] createInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Boulder[] createBoulder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
       
       
       
       
       
       
   
}
   public static void fightInigo(Player player){
       System.out.println("Called from GameControl class. You cannot fight Inigo yet");
       
   }
    public static void talkToInigo(Player player){
       System.out.println("Called from GameControl class. You cannot speak to Inigo yet");
   }   
}
