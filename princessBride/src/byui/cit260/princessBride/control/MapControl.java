/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.control;

import byui.cit260.princessBride.model.Game;
import byui.cit260.princessBride.model.Map;
import byui.cit260.princessBride.model.Scene;
import byui.cit260.princessBride.model.Scene.SceneType;
import java.awt.image.BufferedImage;
import princessbride.PrincessBride;

/**
 *
 * @author Jason
 */
public class MapControl {

   static Map createMap() {
        
       Map map  = new Map (4,5);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        
        return map;
    }
      
      private static Scene[] createScenes() {
        BufferedImage image = null;
        
       Game game = PrincessBride.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
      	

        // STARTING SCENE INDEX 0////
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "\nThe Dreaded Pirate Wesley (YOU) are on a quest to find"
                        + "your true love, Princess Buttercup. In between"
                        + "you and your love are three horrible villians. "
                        + "You are on a boat or something and it lands on the"
                        + "shore. Before you is a cliff where you can see "
                        + "them hoisting the Princess. ");
        startingScene.setMapSymbol( "ST" );
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[Scene.SceneType.start.ordinal()] = startingScene;

	// SHIP SCENE INDEX 1////
        Scene shipScene = new Scene();
        shipScene.setDescription(
                "\nThe Dreaded Pirate Wesley (YOU) are on a quest to find"
                        + "your true love, Princess Buttercup. In between"
                        + "you and your love are three horrible villians. "
                        + "You are on a boat or something and it lands on the"
                        + "shore. Before you is a cliff where you can see "
                        + "them hoisting the Princess. ");
        shipScene.setMapSymbol( "SP" );
        shipScene.setBlocked(false);
        shipScene.setTravelTime(240);
        scenes[Scene.SceneType.ship.ordinal()] = shipScene;

	// SHORE SCENE INDEX 2////
        Scene shoreScene = new Scene();
        shoreScene.setDescription(
                "\nShip Scene ");
        shoreScene.setMapSymbol( "BH" );
        shoreScene.setBlocked(false);
        shoreScene.setTravelTime(240);
        scenes[Scene.SceneType.shore.ordinal()] = shoreScene;

	// CLIFF SCENE INDEX 3////
        Scene cliffScene = new Scene();
        cliffScene.setDescription(
                "\nCliff Scene");
        cliffScene.setMapSymbol( "SH" );
        cliffScene.setBlocked(false);
        cliffScene.setTravelTime(240);
        scenes[Scene.SceneType.cliff.ordinal()] = cliffScene;

	// HILLTOP SCENE INDEX 4////
        Scene hilltopScene = new Scene();
        hilltopScene.setDescription(
                "\ncliff Scene");
        hilltopScene.setMapSymbol( "HT" );
        hilltopScene.setBlocked(false);
        hilltopScene.setTravelTime(240);
        scenes[Scene.SceneType.hilltop.ordinal()] = hilltopScene;

	// BOULDERFIELD SCENE INDEX 5////
        Scene boulderfieldScene = new Scene();
        boulderfieldScene.setDescription(
                "\nBoulder Field Scene");
        boulderfieldScene.setMapSymbol( "BB" );
        boulderfieldScene.setBlocked(false);
        boulderfieldScene.setTravelTime(240);
        scenes[Scene.SceneType.boulderfield.ordinal()] = boulderfieldScene;

	// TORTURECHAMBER SCENE INDEX 6////
        Scene TortureChamberScene = new Scene();
        TortureChamberScene.setDescription(
                "\nTorture Chamber Scene");
        TortureChamberScene.setMapSymbol( "TC" );
        TortureChamberScene.setBlocked(false);
        TortureChamberScene.setTravelTime(240);
        scenes[Scene.SceneType.TortureChamber.ordinal()] = TortureChamberScene;

	// THRONEROOM SCENE INDEX 7////
        Scene ThroneRoomScene = new Scene();
        ThroneRoomScene.setDescription(
                "\nThrone Room Scene");
        ThroneRoomScene.setMapSymbol( "TH" );
        ThroneRoomScene.setBlocked(false);
        ThroneRoomScene.setTravelTime(240);
        scenes[Scene.SceneType.ThroneRoom.ordinal()] = ThroneRoomScene;

        //   FINISHING SCENE  ////
        
         Scene finishScene = new Scene();
        finishScene.setDescription(
         "\nCongratulations! You have finally completed the game"
                 + "and saved the Princess!");
        finishScene.setMapSymbol( "FN" );
        finishScene.setBlocked(false);
        finishScene.setTravelTime((int) Double.POSITIVE_INFINITY);
//        ImageIcon finishSceneImage = MapControl.getImage(finishScene,
//                "PATH_TO_IMAGE");
//        finishScene.setIcon(finishSceneImage);
        scenes[SceneType.finish.ordinal()] = finishScene;
       return scenes;
        
       
    
        
      }

    static void moveActorsToStartingLocation(Map map) {
    System.out.println("*** STUB FUNCTION ***");
    }
}