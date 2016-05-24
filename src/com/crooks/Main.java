package com.crooks;

public class Main {

    public static void main(String[] args) {
        Dog d = new Dog();
        Snake s = new Snake();
        Hawk h = new Hawk();

        d.makeSound();
        s.makeSound();
        h.makeSound();
        System.out.println(d);
        System.out.println(h);
        System.out.println(s);
    }
}
