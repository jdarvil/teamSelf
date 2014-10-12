/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride;

import byui.cit260.princessBride.model.Player;

/**
 *
 * @author Darvil
 */
public class PrincessBride {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Captain Kudos");
        playerOne.setStrength(4.00);
        playerOne.setResistance(2.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
