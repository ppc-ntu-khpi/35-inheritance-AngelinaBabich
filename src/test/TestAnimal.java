package test;

import domain.GuineaPig;

public  class TestAnimal {

    public static void main(String[] args) {
    GuineaPig guineaPig = new GuineaPig ("Button");
    System.out.println(guineaPig);
guineaPig.gnaw();
guineaPig.eat();
guineaPig.sing();
guineaPig.speak();

    }
}
