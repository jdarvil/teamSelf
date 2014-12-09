/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import princessbride.PrincessBride;

/**
 *
 * @author Darvil
 */
public abstract class View implements ViewInterface {
    private final String promptMessage;
   
    protected final BufferedReader keyboard = PrincessBride.getInFile();
    protected final PrintWriter console = PrincessBride.getOutFile();
    
  public View(String promptMessage){
    this.promptMessage = promptMessage;
  }
   
   
  @Override
  public void display(){
    String value;
    char selection = ' ';
    do{
      this.console.println(this.promptMessage); //display promt message
      value = this.getInput(); // get the user selection
      this.doAction(value); // do action based on selection
      
    /* Instructor: 
     * You have an infinite loop here. The value will always be something other
     * than E or e. If one of them is true then the expression evauates to true.
     * Think about the compound operator || (OR). Don't you want something else.
     */ 
    }while (!value.equals("E")||!value.equals("e"));
   
  }

  @Override
  public String getInput(){
  boolean valid = false;
  String selection = null;
   
  try {
    //while a valid name has not been retrived
    while (!valid){
   
          //get the value entered from the keyborad
          selection = this.keyboard.readLine();
          selection = selection.trim();
          
          if(selection.length() < 1 ){ //blank value entered
              ErrorView.display(this.getClass().getName(),
                                "You must enter a value.");
              continue;
          }
          break;
        }
    } catch (Exception e) {
        ErrorView.display(this.getClass().getName(),
                            "Error reading input: " + e.getMessage());
    }
   
    return selection; // return the name
   
  }
   
   
  @Override
  public void doAction(String value){
      
   
  }
   
   
}
