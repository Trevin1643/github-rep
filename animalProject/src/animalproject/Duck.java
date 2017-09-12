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
public class Duck extends BirdClass implements ISwim, IFly, IWalk, IMakeSound{

    public Duck(double wingSpan, String name) {     //constructor
        super(wingSpan, name);
    }

    @Override               //interface info
    public void swim() {
        System.out.println("The duck floats on the water");
    }

    @Override
    public void fly() {
        System.out.println("The duck slys through the air");
    }

    @Override
    public void walk() {
        System.out.println("The duck wuddles around");
    }

    @Override
    public void makeSound() {
        System.out.println("The duck goes quack quack");
    }
    
}
