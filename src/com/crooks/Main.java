package com.crooks;

public class Main {

    public static void main(String[] args) {
        Animal d = createAnimal("Dog");
        Animal s = createAnimal("Snake");
        Animal h = createAnimal("Hawk");

        d.makeSound();
        s.makeSound();
        h.makeSound();
        System.out.println(d);
        System.out.println(h);
        System.out.println(s);
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
                return new Animal();
        }
    }

}
