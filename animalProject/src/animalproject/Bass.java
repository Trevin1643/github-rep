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
public class Bass extends FishClass implements ISwim{
    
    public Bass(boolean isSaltWater, String name) { //constructor
        super(isSaltWater, name);
    }

    @Override               //interface info
    public void swim() {
        System.out.println("The bass swims through the water");
    }
    
}
