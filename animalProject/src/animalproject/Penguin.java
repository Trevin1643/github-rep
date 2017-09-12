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
public class Penguin extends BirdClass implements IWalk, ISwim, IMakeSound{
    
    public Penguin(double wingSpan, String name) {  //constructor from the bird class
        super(wingSpan, name);
    }

    @Override               //info from interfaces
    public void walk() {
        System.out.println("Penguin waddles in snow");
    }

    @Override
    public void swim() {
        System.out.println("Penuin swims in icy water");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin honks");
    }
    
}
