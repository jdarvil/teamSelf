/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.control;

/**
 *
 * @author Darvil
 */
public class InventoryControl {
    
    public double calcVolumeOfGoblet(double height, double diameter) {
   
        if (height < 0) { //height is negative?
            return -1;
        }
        
        if (diameter < 0 || diameter > 15) { //diameter out of range?
            return -1;
        }
        
        double radius = diameter / 2;
        double volume = (Math.PI * Math.pow(radius, 2) * height) / 1728;
        
        return volume;
        
    }
}
