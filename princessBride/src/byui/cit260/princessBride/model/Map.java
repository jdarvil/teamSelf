/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Darvil
 */
public class Map implements Serializable{
    
    
    // class instance variables
    public static double rowCount;
    public static double columnCount;
    public static Location[][] locations;
    public Scene scene;
    public ArrayList<Actor> actors;

    public Map() {
    }

    public Map(int rowCount, int columnCount) {
       if (rowCount < 1 || columnCount < 1) {
           System.out.println("The number of rows or columns must be > 1");
           return;
    }
       this.rowCount = rowCount;
       this.columnCount = columnCount;
       
       //create 2D array for locations
       this.locations = new Location[rowCount][columnCount];
       for (int row = 0; row < rowCount; row++) {
           for (int column = 0; column < columnCount; column++){
               //create and initialize Location object instance
               Location location = new Location();
               location.setColumn(column);
               location.setRow(row);
               location.setVisited(false);
               
               //assign the Location object to the current position in the game
               locations[row][column] = location;
           }
       }
       
    }
    
  
    
       

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    
    
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    
    

    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(double rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(double columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        return true;
    }
    
    
}
