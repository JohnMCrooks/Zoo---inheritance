package com.crooks;

/**
 * Created by johncrooks on 5/24/16.
 */
public class Snake extends Reptile {
    public Snake() {
        this.name = "snake";
    }

    @Override
    public void makeSound(){
        System.out.println("ssssssss....");
    }
}
