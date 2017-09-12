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
public class Ostrich extends BirdClass implements IWalk, IMakeSound{

    public Ostrich(double wingSpan, String name) {  //constructor inherited from bird class
        super(wingSpan, name);
    }

    @Override               //info taken from the interfaces
    public void walk() {
        System.out.println("The Ostrich walks around");
    }

    @Override
    public void makeSound() {
        System.out.println("Ostrich makes booming sounds");
    }
    
}
