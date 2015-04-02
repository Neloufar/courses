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
public class Main {
    
public static void main(String []args){

Courses physics = new PhysicsClass("University Physics II", "Sumitava Chatterjee", "PHY232" , "In this course you will learn about electricity and physics");
Courses differentialEquations = new DFQClass("Differential Equations", "Sumitava Chatterjee","MTH291", "In this course you will learn to solve matricies");
Courses linearAlgebra = new LinearClass("Linear Algebra", "Kevin Chouinard", "MTH285" , "In this course you will learn how to solve and set up differential equations");
Courses computerScience = new CSClass("Computer Science", "Tanes Kanchanawanchai", "CSC201" , "In this course you will learn how to program");
System.out.print(physics.toString());
System.out.print(differentialEquations.toString());
System.out.print(linearAlgebra.toString());
System.out.print(computerScience.toString());
}
}