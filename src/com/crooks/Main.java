package com.crooks;

public class Main {

    public static void main(String[] args) {
        Animal d = createAnimal("Dog");
        Animal s = createAnimal("Snake");
        Animal h = createAnimal("Hawk");

        //Anonymous Class Example
        Animal a = new Reptile() {                  // Doing the same thing as writing a unique class and extending Animal Class
          @Override                                 //Only going to use once.
            public void makeSound() {               //This is called an Anonymous class, You can't reuse the code but should only ever use it for one off circumstances
              System.out.println("Croak!");         //
          }
        };
        a.name = "Alligator";

        //Anonymous Functions Aka lambdas  - a function or method without a name that's embedded in your code.
        //creates a passable object out of a method.
        Runnable r = () -> {
            System.out.println("Hello from Lambda");
        };

        helloWorld(r);


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

    public static void helloWorld(Runnable runnable){
        System.out.println("Hello World");
        runnable.run();
    }
}
