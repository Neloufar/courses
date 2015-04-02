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

class Courses {
    
public String description;
public String course;
public String number;
public String department;

public Courses(String courseName, String departmentName, String courseNumber, String courseDescription)
{
  this.course = courseName;
  this.department = departmentName;
  this.number = courseNumber;
  this.description = courseDescription;
  }
  
 public String toString(){
 
 return "Course name is " + course + "Course number is " + number + "Course Department" 
 + department + "Course Description : " + description;
}
}

