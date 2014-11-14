/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Darvil
 */
  public enum Actor implements Serializable{
    
    // class instance variables
    Inigo("You killed your father. Prepare to die."),
    Fezzik("He is a giant.");
    private final String description;
    private final Point coordinates;

     

    
   Actor(String description){
       this.description = description;
       coordinates = new Point(1,1);
       
   } 

   

    public String getDescription() {
        return description;
    }

    
    public Point getCoordinates() {
        return coordinates;
    }

   

////    @Override
//    public int hashCode() {
//        int hash = 7;
//      
//        hash = 59 * hash + Objects.hashCode(this.description);
//        hash = 59 * hash + Objects.hashCode(this.coordinates);
//        return hash;
//    }

   
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Actor other = (Actor) obj;
//        if (!Objects.equals(this.description, other.description)) {
//            return false;
//        }
//        if (!Objects.equals(this.description, other.description)) {
//            return false;
//        }
//        if (!Objects.equals(this.coordinates, other.coordinates)) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return "Actor{" + ", description=" + description + ", coordinates=" + coordinates + '}';
    }
}