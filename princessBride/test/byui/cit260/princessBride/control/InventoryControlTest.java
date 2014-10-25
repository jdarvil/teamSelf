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
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcVolumeOfGoblet method, of class InventoryControl.
     */
    @Test
    public void testCalcVolumeOfGoblet() {
        System.out.println("calcVolumeOfGoblet");
        
        /***********************
         * Test case #1
         **********************/
        System.out.println("\tTest case #1");
        double height = 4.0;
        double diameter = 6.0;
        
        double expResult = 0.0654; //expected output returned value
        
        //create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        
        //call function to run test
        double result = instance.calcVolumeOfGoblet(height, diameter);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         * Test case #2
         **********************/
        System.out.println("\tTest case #2");
        height = -1.0;
        diameter = 6.0;
        
        expResult = -1; //expected output returned value
                
        //call function to run test
        result = instance.calcVolumeOfGoblet(height, diameter);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

         /***********************
         * Test case #3
         **********************/
        System.out.println("\tTest case #3");
        height = 4.0;
        diameter = -1.0;
        
        expResult = -1; //expected output returned value
                
        //call function to run test
        result = instance.calcVolumeOfGoblet(height, diameter);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

         /***********************
         * Test case #4
         **********************/
        System.out.println("\tTest case #4");
        height = 4.0;
        diameter = 18.0;
        
        expResult = -1; //expected output returned value
                
        //call function to run test
        result = instance.calcVolumeOfGoblet(height, diameter);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

         /***********************
         * Test case #5
         **********************/
        System.out.println("\tTest case #5");
        height = 0.0;
        diameter = 6.0;
        
        expResult = 0; //expected output returned value
                
        //call function to run test
        result = instance.calcVolumeOfGoblet(height, diameter);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

         /***********************
         * Test case #6
         **********************/
        System.out.println("\tTest case #6");
        height = 4.0;
        diameter = 0.0;
        
        expResult = 0; //expected output returned value
                
        //call function to run test
        result = instance.calcVolumeOfGoblet(height, diameter);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

         /***********************
         * Test case #7
         **********************/
        System.out.println("\tTest case #7");
        height = 4.0;
        diameter = 15.0;
        
        expResult = 0.4090; //expected output returned value
                
        //call function to run test
        result = instance.calcVolumeOfGoblet(height, diameter);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
    }
    
}
