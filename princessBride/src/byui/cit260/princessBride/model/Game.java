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
public class Game implements Serializable{
    
    // class instance variables
    private double noPeople;
    private Boulder[] boulder;
    private InventoryItem[] inventory;
    private Goblet goblet;
    private TortureDevice torturedevice;
    private Map map;
    private Player player;
    

    public Game() {
    }
    
    

    public double getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(double noPeople) {
        this.noPeople = noPeople;
    }

    public Boulder[] getBoulder() {
        return boulder;
    }

    public void setBoulder(Boulder[] boulder) {
        this.boulder = boulder;
    }

    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public Goblet getGoblet() {
        return goblet;
    }

    public void setGoblet(Goblet goblet) {
        this.goblet = goblet;
    }

    public TortureDevice getTorturedevice() {
        return torturedevice;
    }

    public void setTorturedevice(TortureDevice torturedevice) {
        this.torturedevice = torturedevice;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "Game{" + "noPeople=" + noPeople + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.noPeople) ^ (Double.doubleToLongBits(this.noPeople) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.noPeople) != Double.doubleToLongBits(other.noPeople)) {
            return false;
        }
        return true;
    }

    public void TortureDevice(TortureDevice torturedevice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
