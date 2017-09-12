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
public class Eagle extends BirdClass implements IFly, IWalk, IMakeSound{
    
    public Eagle(double wingSpan, String name) {    //constructor from bird class
        super(wingSpan, name);
    }

    @Override               //interface info
    public void fly() {
        System.out.println("Eagle soars through the sky");
    }

    @Override
    public void walk() {
        System.out.println("The eagle hops through the grass");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle makes high-pitched whistles");
    }
    
}
