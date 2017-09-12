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
public class Dolphin extends MammalClass implements ISwim, IMakeSound{

    public Dolphin(double bodyTemp, String name) {  //constructor
        super(bodyTemp, name);
    }
    

    @Override               //interface info
    public void swim() {
        System.out.println("Dolphin swims through the water");
    }

    @Override
    public void makeSound() {
        System.out.println("Dolphin clicks and whistles");
    }
    
}
