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
        
       Map map  = new Map (1,9);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        
        return map;
    }
      
      private static Scene[] createScenes() {
        BufferedImage image = null;
            Game game = PrincessBride.getCurrentGame();
        Scene[] scenes = new Scene[Scene.SceneType.values().length];
        // STARTING SCENE////
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
//        ImageIcon startingSceneImage = MapControl.getImage(startingScene,
//                "PATH_TO_IMAGE")
//                ;
//        startingScene.setIcon(startingSceneImage);
        scenes[Scene.SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
         "\nCongratulations! You have finally completed the game"
                 + "and saved the Princess!");
        finishScene.setMapSymbol( "FN" );
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
//        ImageIcon finishSceneImage = MapControl.getImage(finishScene,
//                "PATH_TO_IMAGE");
//        finishScene.setIcon(finishSceneImage);
        scenes[SceneType.finish.ordinal()] = finishScene;
       return null;
        
       
    
        
      }

    static void moveActorsToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}