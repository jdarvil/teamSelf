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
import byui.cit260.princessBride.model.Location;
import byui.cit260.princessBride.model.Map;
import byui.cit260.princessBride.model.Player;
import byui.cit260.princessBride.model.Scene;
import byui.cit260.princessBride.model.Scene.SceneType;
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
       
       Boulder boulder = new Boulder();
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

    public static InventoryItem[] createInventoryList() {
      // cre8ated array[list] of inventory items
        InventoryItem[] inventory =
                    new InventoryItem[4];
        
        InventoryItem knife = new InventoryItem();
        knife.setInventoryType("Knife");
        knife.setQuantityInStock(0);
        knife.setRequiredAmount(0);
        inventory[Item.knife.ordinal()] = knife;
        
        InventoryItem potion = new InventoryItem();
        potion.setInventoryType("potion");
        potion.setQuantityInStock(0);
        potion.setRequiredAmount(0);
        inventory[Item.potion.ordinal()] = potion;
        
        InventoryItem sword = new InventoryItem();
        sword.setInventoryType("sword");
        sword.setQuantityInStock(0);
        sword.setRequiredAmount(0);
        inventory[Item.sword.ordinal()] = sword;
        
          
        InventoryItem key = new InventoryItem();
        key.setInventoryType("key");
        key.setQuantityInStock(0);
        key.setRequiredAmount(0);
        inventory[Item.key.ordinal()] = key;
           
        return inventory;
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
       Location[][] locations = map.getLocations();
       
       //start point
       locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
       locations[0][1].setScene(scenes[SceneType.ship.ordinal()]);
       locations[0][2].setScene(scenes[SceneType.shore.ordinal()]);
       locations[0][3].setScene(scenes[SceneType.cliff.ordinal()]);
       locations[0][4].setScene(scenes[SceneType.hilltop.ordinal()]);
       locations[0][5].setScene(scenes[SceneType.boulderfield.ordinal()]);
       locations[0][6].setScene(scenes[SceneType.TortureChamber.ordinal()]);
       locations[0][7].setScene(scenes[SceneType.ThroneRoom.ordinal()]);
       locations[0][8].setScene(scenes[SceneType.finish.ordinal()]);
        
    }

    public static InventoryItem[] getSortedInventoryList() {
       //get inventory list for the current game
        InventoryItem[] originalInventoryList = PrincessBride.getCurrentGame().getInventory();
        
        //clone (make a copy) originalList
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
        //using a BubbleSort to sort the list of inventoryList by name
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++) {
            for (int j = 0; j < inventoryList.length-1-i; j++) {
                if (inventoryList[j].getInventoryType(). compareToIgnoreCase(inventoryList[j + 1].getInventoryType()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
            }
        }
        
        return inventoryList;
    }

    private enum Item {
        knife,
        potion,
        sword,
        key;
         }
    
       
       
       
       
       
       
       
   
}
//   public static void fightInigo(Player player){
//       System.out.println("Called from GameControl class. You cannot fight Inigo yet");
//       
//   }
//    public static void talkToInigo(Player player){
//       System.out.println("Called from GameControl class. You cannot speak to Inigo yet");
//   }   


