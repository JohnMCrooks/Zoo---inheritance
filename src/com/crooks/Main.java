package com.crooks;

public class Main {

    public static void main(String[] args) {
        Animal d = createAnimal("Dog");
        Animal s = createAnimal("Snake");
        Animal h = createAnimal("Hawk");

        Animal a = new Reptile() {                  // Doing the same thing as writing a unique class and extending Animal Class
          @Override                                 //Only going to use once.
            public void makeSound() {               //This is called an annonymous class, You can't reuse the code but should only ever use it for one off circumstances
              System.out.println("Croak!");
          }
        };
        a.name = "Alligator";

        d.makeSound();
        s.makeSound();
        h.makeSound();
        a.makeSound();

        System.out.println(d);
        System.out.println(h);
        System.out.println(s);
        System.out.println(a);
    }

    public static Animal createAnimal(String name){
        switch (name){
            case "Dog":
                return new Dog();

            case "Snake":
                return new Snake();

            case "Hawk":
                return new Hawk();

            default:
                return null;
        }
    }

}
