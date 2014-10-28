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
public class BoulderControl {
    
    public double calcBoulderSize(double height, double width, double depth) {
        
        if (height < 0) {
            return -1;
        }

        if (width < 0) {
            return -1;
        }
        if (depth < 0) {
            return -1;
        }
        double size = height * width * depth;

        return size;

    }
    
}
