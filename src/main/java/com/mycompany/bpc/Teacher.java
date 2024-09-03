/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bpc;

/**
 *
 * @author LENOVO
 */
public class Teacher {
    private int teacherID;
    private String fullName;
    private String email;
    //static data member
  private static  int count ; //Classname.membername

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Teacher() {
        //do nothing
        updateTeacherCount();
    }

    public  Teacher(int teacherID, String fullName, String email) {
        this.teacherID = teacherID;
        this.fullName = fullName;
        this.email = email;
        updateTeacherCount();
    }
    public void publishAssignment(Assignment a){
        //object as args
        System.out.println("Teacher "+ fullName + " has provided "+a.getTitle());
    }
    public static void updateTeacherCount(){
        ++count;
    }
    public static int getCount(){
        return count;
    }
    
}
