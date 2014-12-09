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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Darvil
 */
public class PrincessBride {
    /**
     * @param args the command line arguments
     */    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {
        
        try {
            
           PrincessBride.inFile = 
                   new BufferedReader(new InputStreamReader(System.in));
           
           PrincessBride.outFile = new PrintWriter(System.out, true);
           
           //open log file
           String filePath = "log.txt";
           PrincessBride.logFile = new PrintWriter(filePath);
           
        } catch (Exception e) {
                System.out.println("Exception: " + e.toString() +
                                    "\nCause: " + e.getCause() +
                                    "\nMessage: " + e.getMessage());
            
        }
        
        finally {
            try {
                if (PrincessBride.inFile != null)
                PrincessBride.inFile.close();
                
                if (PrincessBride.outFile != null)
                PrincessBride.outFile.close();
                
                if (PrincessBride.logFile != null)
                    PrincessBride.outFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            
        }
        
        Player playerOne = new Player();
//        
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
        
        Map.setRowCount(3.00);
        Map.setColumnCount(2.00);
        
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
        
//        actorOne.setName("Joe");
       
//        String actorInfo = actorOne.toString();
//        System.out.println(actorInfo);
//      
        Scene sceneOne = new Scene();
        
        sceneOne.setDescription("I don't know");
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
////        
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

     public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        PrincessBride.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PrincessBride.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        PrincessBride.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        PrincessBride.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        PrincessBride.logFile = logFile;
    }
    

    
}
  
