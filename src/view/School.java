/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;

/**
 *
 * @author nikitaivancov
 */
public class School {
    private ArrayList<Student> students;
    private int num;
    private String name;
    public School(int num,String name)
    {
        this.num=num;
        this.name=name;
        students= new ArrayList<Student>();
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }
    
    public int getSchoolNum(){
       return num;
   }
   
    public String getSchoolName(){
       return name;
   }
   
}
