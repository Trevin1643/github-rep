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
public class FishClass extends AnimalClass{
    private boolean isSaltWater;

    public FishClass(boolean isSaltWater, String name) {    //fish class constructor
        super(name);
        this.isSaltWater = isSaltWater;
    }
    
    
}
