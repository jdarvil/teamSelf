/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.model;

import java.io.Serializable;

/**
 *
 * @author Darvil
 */
public class TortureDevice implements Serializable{
    
    // class instance variables
    private double maxLevel;
    private double setLevel;
    private double resistanceLevel;

    public TortureDevice() {
    }
    
    

    public double getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(double maxLevel) {
        this.maxLevel = maxLevel;
    }

    public double getSetLevel() {
        return setLevel;
    }

    public void setSetLevel(double setLevel) {
        this.setLevel = setLevel;
    }

    public double getResistanceLevel() {
        return resistanceLevel;
    }

    public void setResistanceLevel(double resistanceLevel) {
        this.resistanceLevel = resistanceLevel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.maxLevel) ^ (Double.doubleToLongBits(this.maxLevel) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.setLevel) ^ (Double.doubleToLongBits(this.setLevel) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.resistanceLevel) ^ (Double.doubleToLongBits(this.resistanceLevel) >>> 32));
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
        final TortureDevice other = (TortureDevice) obj;
        if (Double.doubleToLongBits(this.maxLevel) != Double.doubleToLongBits(other.maxLevel)) {
            return false;
        }
        if (Double.doubleToLongBits(this.setLevel) != Double.doubleToLongBits(other.setLevel)) {
            return false;
        }
        if (Double.doubleToLongBits(this.resistanceLevel) != Double.doubleToLongBits(other.resistanceLevel)) {
            return false;
        }
        return true;
    }
    
    
}   
