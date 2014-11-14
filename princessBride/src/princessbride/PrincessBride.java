/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride;

import byui.cit260.princessBride.model.Actor;
import byui.cit260.princessBride.model.Boulder;
import byui.cit260.princessBride.model.Game;
import byui.cit260.princessBride.model.Goblet;
import byui.cit260.princessBride.model.InventoryItem;
import byui.cit260.princessBride.model.Location;
import byui.cit260.princessBride.model.Map;
import byui.cit260.princessBride.model.Player;
import byui.cit260.princessBride.model.Scene;
import byui.cit260.princessBride.model.TortureDevice;
import byui.cit260.princessBride.model.Weapon;
import byui.cit260.princessBride.view.StartProgramView;

/**
 *
 * @author Darvil
 */
public class PrincessBride {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Captain Kudos");
        playerOne.setStrength(4.00);
        playerOne.setResistance(2.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Game gameOne = new Game();
        
        gameOne.setNoPeople(2.00);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        Map mapOne = new Map();
        
        mapOne.setRowCount(3.00);
        mapOne.setColumnCount(2.00);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        Location locationOne = new Location();
        
        locationOne.setRow(8.00);
        locationOne.setColumn(18.00);
        locationOne.setVisited(false);
        locationOne.setAmountRemaining(4.00);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
//        Actor actorOne = new Actor();
//        
//        actorOne.setName("Joe");
        
//        String actorInfo = actorOne.toString();
//        System.out.println(actorInfo);
        
        Scene sceneOne = new Scene();
        
        sceneOne.setDescription("I don't know");
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        InventoryItem itemOne = new InventoryItem();
        
        itemOne.setInventoryType("weapon");
        itemOne.setQuantityInStock(8.00);
        itemOne.setRequiredAmount(30.00);
        
        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
        
        Weapon weaponOne = new Weapon();
        
        weaponOne.setType("Sword");
        weaponOne.setPower(5.00);
        weaponOne.setRemainingHits(80);
        
        String weaponInfo = weaponOne.toString();
        System.out.println(weaponInfo);
        
        Boulder boulderOne = new Boulder();
        
        boulderOne.setHeight(3.00);
        boulderOne.setWidth(29.00);
        boulderOne.setDepth(54.00);
        boulderOne.setVolume(0.00);
        boulderOne.setPower(8.00);
        
        String boulderInfo = boulderOne.toString();
        System.out.println(boulderInfo);
        
        Goblet gobletOne = new Goblet();
        
        gobletOne.setHeight(3.00);
        gobletOne.setWidth(3.00);
        gobletOne.setVolume(0.00);
        
        String gobletInfo = gobletOne.toString();
        System.out.println(gobletInfo);
        
        TortureDevice tortureOne = new TortureDevice();      
        tortureOne.setMaxLevel(18.00);
        tortureOne.setSetLevel(21.00);
        tortureOne.setResistanceLevel(22.00);
        
        String tortureInfo = tortureOne.toString();
        System.out.println(tortureInfo);
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
    
    }

    public static void setPlayer(Player player) {
         System.out.println("\n setPlayer called.");
    }

    public static Player getPlayer() {
         System.out.println("\n getPlayer called."); 
         return null;
    }

    public static void setCurrentGame(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Object getCurrentGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}



   

    
    
  
    

