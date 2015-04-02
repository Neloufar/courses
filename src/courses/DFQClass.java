/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package courses;

/**
 *
 * @author neliloghmani
 */

 public class DFQClass extends Courses {
   
    public DFQClass(String courseName, String departmentName, String courseNumber, String courseDescription)
    {
        super(courseName, departmentName, courseNumber, courseDescription);
    }
    public String toString(){
 
  return "\n This Course is offered by the math department\n" + "\nCourse name is: " + course + 
 "\nCourse number is: " + number + "\nCourse Department: " 
 + department + "\nCourse Description : " + description; 
    }
 
}
    

