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
public class Boulder implements Serializable {
    
    // class instance variables
    private double height;
    private double width;
    private double depth;
    private double volume;
    private double power;

    public Boulder() {
        this.height = 0;
        this.width = 0;
        this.depth = 0;
        this.volume = 0;
        this.power = 0;
        
    }
    
    

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.depth) ^ (Double.doubleToLongBits(this.depth) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.volume) ^ (Double.doubleToLongBits(this.volume) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.power) ^ (Double.doubleToLongBits(this.power) >>> 32));
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
        final Boulder other = (Boulder) obj;
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        if (Double.doubleToLongBits(this.depth) != Double.doubleToLongBits(other.depth)) {
            return false;
        }
        if (Double.doubleToLongBits(this.volume) != Double.doubleToLongBits(other.volume)) {
            return false;
        }
        if (Double.doubleToLongBits(this.power) != Double.doubleToLongBits(other.power)) {
            return false;
        }
        return true;
    }
    
    
    
}
