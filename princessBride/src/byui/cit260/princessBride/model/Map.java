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

    public static double getRowCount() {
        return rowCount;
    }

    public static void setRowCount(double rowCount) {
        Map.rowCount = rowCount;
    }

    public static double getColumnCount() {
        return columnCount;
    }

    public static void setColumnCount(double columnCount) {
        Map.columnCount = columnCount;
    }

    public static Location[][] getLocations() {
        return locations;
    }

    public static void setLocations(Location[][] locations) {
        Map.locations = locations;
    }
    

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
