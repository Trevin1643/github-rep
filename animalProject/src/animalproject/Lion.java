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
public class Lion extends MammalClass implements IWalk, IMakeSound{
    
    public Lion(double bodyTemp, String name) { //constructor
        super(bodyTemp, name);
    }

    @Override               //interface info
    public void walk() {
        System.out.println("The lion walks around");
    }

    @Override
    public void makeSound() {
        System.out.println("The lion roars");
    }
    
}
