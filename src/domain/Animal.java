package domain;

public class Animal {

    protected String name;

    protected int weight;

    protected int size;

    public Animal() {
        name="generic animal";
weight=25;
    }

    public void eat() {
        System.out.println( "Animal eating...");
    }

    public void speak() {
        System.out.println("Animal speaking...");
    }

    @Override
    public String toString() {
        return "My animal" + "\nname:\t" + name + ", \nweight:\t" + weight + ", \nsize:\t" + size ;
    }


}
