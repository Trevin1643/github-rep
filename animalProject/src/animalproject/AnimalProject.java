/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproject;

import java.util.ArrayList;

/**
 *
 * @author tmiller
 */
public class AnimalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dolphin Caleb = new Dolphin(36., "Caleb");
        Lion AG = new Lion(100.5, "AG");
        Bat Tyler = new Bat(44.0, "Tyler");
        Ostrich Ethan = new Ostrich(6.6, "Ethan");
        Penguin Blake = new Penguin(1.1, "Blake");
        Eagle Timmy = new Eagle(5.9, "Timmy");
        Shark John = new Shark(true, "John");
        Bass Zach = new Bass(false, "Zach");
        FlyingFish Parker = new FlyingFish(true, "Parker");
        Duck Aiden = new Duck(2.7, "Aiden");
        
        ArrayList<AnimalClass> Animals = new ArrayList<>();  //Makes array lists
            Animals.add(Caleb);         //Adds the animals to the lists
            Animals.add(AG);
            Animals.add(Tyler);
            Animals.add(Ethan);
            Animals.add(Blake);
            Animals.add(Timmy);
            Animals.add(John);
            Animals.add(Zach);
            Animals.add(Parker);
            Animals.add(Aiden);
        ArrayList<BirdClass> Birds = new ArrayList<>();
            Birds.add(Ethan);
            Birds.add(Blake);
            Birds.add(Timmy);
            Birds.add(Aiden);
        ArrayList<MammalClass> Mammals = new ArrayList<>();
            Mammals.add(Caleb);
            Mammals.add(AG);
            Mammals.add(Tyler);
        ArrayList<FishClass> Fishes = new ArrayList<>();
            Fishes.add(Parker);
            Fishes.add(Zach);
            Fishes.add(John);
        ArrayList<IFly> Flyers = new ArrayList<>();
            Flyers.add(Tyler);
            Flyers.add(Timmy);
            Flyers.add(Parker);
            Flyers.add(Aiden);
        ArrayList<IWalk> Walkers = new ArrayList<>();
            Walkers.add(AG);
            Walkers.add(Ethan);
            Walkers.add(Blake);
            Walkers.add(Timmy);
            Walkers.add(Aiden);
        ArrayList<ISwim> Swimmers = new ArrayList<>();
            Swimmers.add(Caleb);
            Swimmers.add(Blake);
            Swimmers.add(John);
            Swimmers.add(Zach);
            Swimmers.add(Parker);
            Swimmers.add(Aiden);
        ArrayList<IMakeSound> SoundMakers = new ArrayList<>();
            SoundMakers.add(Caleb);
            SoundMakers.add(AG);
            SoundMakers.add(Tyler);
            SoundMakers.add(Timmy);
            SoundMakers.add(Blake);
            SoundMakers.add(Ethan);
            SoundMakers.add(Aiden);
        
        for(IFly fly: Flyers)           //prints out the animals information
        {
            fly.fly();
            System.out.println(" ");
        }
        for(IWalk walk: Walkers)
        {
            walk.walk();
            System.out.println(" ");
        }
        for(ISwim swim: Swimmers)
        {
            swim.swim();
            System.out.println(" ");
        }
        for(IMakeSound sound: SoundMakers)
        {
            sound.makeSound();
            System.out.println(" ");
        }
    }
    
}
