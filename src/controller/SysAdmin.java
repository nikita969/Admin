/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.Student;
import view.School;
import java.util.ArrayList;

/**
 *
 * @author nikitaivancov
 */
public class SysAdmin {
   private final ArrayList<School> schools = new ArrayList<School>();
   
    private SysAdmin(){
    schools.add(new School(14 , "ORT PSAGOT"));
    schools.add(new School(236,"ORT KRAMIM"));
    }
    
    private static SysAdmin instance;
    private ArrayList<School>  list = new ArrayList<School>() ;
    public static SysAdmin getInstance(){
        if (instance == null){
            instance = new SysAdmin();
        }
        return instance;
    }
    
    public void addStudent(String name, Student st){
        School sc=null;
        for(int i=0; i<schools.size();i++){
           if(schools.get(i).getSchoolName().equals(name))
             sc = schools.get(i);
        }
        if(sc == null) return;
        ArrayList<Student> students = sc.getStudents();
        students.add(st);
      }
    
    public ArrayList<School> getSchools(){
        return schools;
    }
    public School getSchool(String name){
        School sch = null;
        for(int i=0; i<schools.size();i++)
            if(schools.get(i).getSchoolName().equals(name))
                sch=schools.get(i);
        return sch;
    }

    public void removeStudent(String schoolName, String removeID) {
       School sch = getSchool(schoolName);
       ArrayList <Student> st = sch.getStudents();
       for(int i=0;i<st.size();i++){
           if(st.get(i).getID().equals(removeID))
               st.remove(i);  
       }        
    }
    
    public boolean checkID(String schName,String ID){
        School sch=null;
         for(int i=0; i<schools.size();i++)
            if(schools.get(i).getSchoolName().equals(schName))
                  sch = schools.get(i);
            ArrayList<Student> st= sch.getStudents();
            for(int i=0; i<st.size();i++)
                if(st.get(i).getID().equals(ID))
                    return false;
            return true;
    }     
}
