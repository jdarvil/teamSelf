/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.control;

import byui.cit260.princessBride.model.Map;
import byui.cit260.princessBride.model.Scene;

/**
 *
 * @author Jason
 */
class MapControl {

   private static Map createMap() {
      Map map = new Map(5,5);
      
      Scene[] scenes = createScenes();
      
      GameControl.assignScenesToLocations(map, scenes);
      
      return map;
    }

    static void moveActorsToStartingLocation(Map map) {
        System.out.println("*** called moveActorsToStartingLocation ***");
    }

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
