/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

/**
 *
 * @author Enubs
 */
public class Lesson1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person[] person = new Person[3]; //array declaration
        
        //below are object instantiations
        person[0] = new Person("Dela Cruz", "Juan", "Perez", 18, "Davao City");
        person[1] = new Person("Magtanggol", "Pedro", "Tahimik", 20, "Manila");
        person[2] = new Person("La Paz", "Asuncion", "Santos", 30, "Cebu City");
        
        //
        System.out.println(person[0].getFirstname() + " " 
                + person[0].getMiddlename().charAt(0) + ". "
                + person[0].getLastname() + ", " 
                + person[0].getAge() + "\n"
                + person[0].getAddress());
    }
    
}



