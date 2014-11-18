/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.model;

import java.io.Serializable;
import java.util.Objects;
import javax.swing.ImageIcon;
import princessbride.PrincessBride;
import byui.cit260.princessBride.control.MapControl;
        
        
/**
 *
 * @author Darvil
 */
public class Scene implements Serializable{

    
    
    public static enum SceneType {
        start,
        ship,
        shore,
        cliff,
        boulderfield,
        hilltop,
        TortureChamber,
        ThroneRoom, 
        finish,}
            
    
    // class instance variables
    public String description;
    public String MapSymbol;
    public boolean Blocked;
    public double TravelTime;

    public double getTravelTime() {
        return TravelTime;
    }

    public void setTravelTime(int TravelTime) {
        this.TravelTime = TravelTime;
    }

    public String getMapSymbol() {
        return MapSymbol;
    }

    public void setMapSymbol(String MapSymbol) {
        this.MapSymbol = MapSymbol;
    }

    public boolean isBlocked() {
        return Blocked;
    }

    public void setBlocked(boolean Blocked) {
        this.Blocked = Blocked;
    }
  
    

    public Scene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
}


