/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Darvil
 */
public class BoulderControlTest {
    
    public BoulderControlTest() {
    }

    /**
     * Test of calcBoulderSize method, of class BoulderControl.
     */
    @Test
    public void testCalcBoulderSize() {
        
        System.out.println("calcBoulderSize");
        
        /**************************
         * Test case #1
         *************************/
        System.out.println("\tTest case #1");
        
        double height = 8.0;
        double width = 4.0;
        double depth = 6.0;
        
        double expResult = 192.0;

        BoulderControl instance = new BoulderControl();
        
        double result = instance.calcBoulderSize(height, width, depth);
        
        assertEquals(expResult, result, 0.0001);
   
        /**************************
         * Test case #2
         *************************/
        System.out.println("\tTest case #2");
        
        height = -1.0;
        width = 4.0;
        depth = 6.0;
        
        expResult = -1.0;
        
        result = instance.calcBoulderSize(height, width, depth);
        
        assertEquals(expResult, result, 0.0001);
        
        /**************************
         * Test case #3
         *************************/
        System.out.println("\tTest case #3");
        
        height = 8.0;
        width = -1.0;
        depth = 6.0;
        
        expResult = -1.0;
        
        result = instance.calcBoulderSize(height, width, depth);
        
        assertEquals(expResult, result, 0.0001);
        
           /**************************
         * Test case #4
         *************************/
        System.out.println("\tTest case #4");
        
        height = 8.0;
        width = 4.0;
        depth = -1.0;
        
        expResult = -1.0;
        
        result = instance.calcBoulderSize(height, width, depth);
        
        assertEquals(expResult, result, 0.0001);
        
           /**************************
         * Test case #5
         *************************/
        System.out.println("\tTest case #5");
        
        height = 0.0;
        width = 4.0;
        depth = 6.0;
        
        expResult = 0.0;
        
        result = instance.calcBoulderSize(height, width, depth);
        
        assertEquals(expResult, result, 0.0001);
        
           /**************************
         * Test case #6
         *************************/
        System.out.println("\tTest case #6");
        
        height = 8.0;
        width = 0.0;
        depth = 6.0;
        
        expResult = 0.0;
        
        result = instance.calcBoulderSize(height, width, depth);
        
        assertEquals(expResult, result, 0.0001);
        
           /**************************
         * Test case #7
         *************************/
        System.out.println("\tTest case #7");
        
        height = 8.0;
        width = 4.0;
        depth = 0.0;
        
        expResult = 0.0;
        
        result = instance.calcBoulderSize(height, width, depth);
        
        assertEquals(expResult, result, 0.0001);
    }
    
}
