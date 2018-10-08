package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();

        for (Animal a : animals) {
            System.out.println(a.makeSound());
            if(a instanceof Chicken){
                Edible edibler = (Chicken) a;
                System.out.println(edibler.howToEat());
            }
        }


        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }

    }
}
