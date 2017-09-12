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
public class FlyingFish extends FishClass implements ISwim, IFly{
    
    public FlyingFish(boolean isSaltWater, String name) {   //constructor
        super(isSaltWater, name);
    }

    @Override               //interface info
    public void swim() {
        System.out.println("The flying fish swims through the water");
    }

    @Override
    public void fly() {
        System.out.println("The flying fish glides through the air");
    }
    
}
