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
public class Player implements Serializable{
    // class instance variables
    private String name;
    private double strength;
    private double resistance;

    public Player() {
    }
     

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", strength=" + strength + ", resistance=" + resistance + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.strength) ^ (Double.doubleToLongBits(this.strength) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.resistance) ^ (Double.doubleToLongBits(this.resistance) >>> 32));
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.strength) != Double.doubleToLongBits(other.strength)) {
            return false;
        }
        if (Double.doubleToLongBits(this.resistance) != Double.doubleToLongBits(other.resistance)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
