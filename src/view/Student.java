/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Random;

/**
 *
 * @author nikitaivancov
 */
public class Student {
    private String ID;
    private String firstName;
    private String lastName;
    private int avgGrade;
    public Student(String ID, String firstName, String lastName){
        Random randomGenerator = new Random();
        this.avgGrade = randomGenerator.nextInt(101);
        this.ID=ID;
        this.firstName=firstName;
        this.lastName=lastName;   
    }
     
    public String getID(){
        return ID;
    }
    
    public String getfirstName(){
      return firstName;
    }
    
    public String getlastName(){
        return lastName;
    } 
    
    public int getGrade(){
        return avgGrade;
    }
}