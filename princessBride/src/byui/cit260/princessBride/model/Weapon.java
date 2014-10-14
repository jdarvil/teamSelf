/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Darvil
 */
public class Weapon implements Serializable {
    
    // class instance variables
    private String type;
    private double power;
    private double remainingHits;

    public Weapon() {
    }
    
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getRemainingHits() {
        return remainingHits;
    }

    public void setRemainingHits(double remainingHits) {
        this.remainingHits = remainingHits;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.type);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.power) ^ (Double.doubleToLongBits(this.power) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.remainingHits) ^ (Double.doubleToLongBits(this.remainingHits) >>> 32));
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
        final Weapon other = (Weapon) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (Double.doubleToLongBits(this.power) != Double.doubleToLongBits(other.power)) {
            return false;
        }
        if (Double.doubleToLongBits(this.remainingHits) != Double.doubleToLongBits(other.remainingHits)) {
            return false;
        }
        return true;
    }
    
    
}
