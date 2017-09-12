/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproject;

/**
 *
 * @author tmiller
 */
public class MammalClass extends AnimalClass{
    private double bodyTemp;

    public MammalClass(double bodyTemp, String name) {  //mammal class constructor
        super(name);
        this.bodyTemp = bodyTemp;
    }
    
    
}
