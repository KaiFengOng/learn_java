/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregation;

import java.util.*;
import java.io.*;

/**
 *
 * @author Ong Kai Feng
 */
public class aggregation_2 {
    
    public static void main(String[] args){
        
        //Initialize 
        Course course = new Course("Computer Science");
        Student stu1 = new Student("Jimmy", "DSN2000");
        
        //HashSet<>() - is a class that extends AbstractSet and implements the Set Interface in Java
        Set<Student> students = new HashSet<>();
        students.add(stu1);
        
        course.setStudent(students);
        
        System.out.println(stu1.getStudentName() 
                            +  stu1.getStudentID()
                            + " belongs to " 
                            + course.getcourseName()); 
    }
}

//In private class - all need use setter & getter
class Course{
    private String coursename;
    private Set<Student> students; //object of student
    
    //Setter
    Course(String coursename){
        this.coursename = coursename;
    }
    
    public String getcourseName(){
        return this.coursename;
    }
    
    public void setStudent(Set<Student> students){
        this.students = students;
    }
    
    public Set<Student> getStudent(Set<Student> student){
        return this.students;
    }
}

class Student{
    private String name;
    private String ID;
    
    //Setter 
    Student(String name, String ID){
        this.name = name;
        this.ID = ID;
    }
    
    //Getter
    public String getStudentName(){
        return this.name;
    }
    
    public String getStudentID(){
        return this.ID;
    }
}