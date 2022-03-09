/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.pkg1;

/**
 *
 * @author Nasywa Davina
 */
public class AeroPlan extends Vehicle {
    
    public void walk(){
        System.out.println("Aeroplan Flying");
    }
    public static void main(String [] args){
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
    
}
