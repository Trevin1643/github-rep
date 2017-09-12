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
public class Bat extends MammalClass implements IFly, IMakeSound{
    
    public Bat(double bodyTemp, String name) {  //constructor
        super(bodyTemp, name);
    }

    @Override               //interface info
    public void fly() {
        System.out.println("The bat flys through the night sky");
    }

    @Override
    public void makeSound() {
        System.out.println("The bat goes screech screech");
    }
    
}
