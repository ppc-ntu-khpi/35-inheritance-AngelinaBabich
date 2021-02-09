package domain;

public class GuineaPig extends Rodent {

    private String kind;

    public GuineaPig(String name, int weight, int size, String kind) {
    this.name=name;
    this.size=size;
    this.weight=weight;
    this.kind=kind;
    }

    public GuineaPig() {
   this("Fluffy",1,2,"outlet");
    }

    public GuineaPig(String name) {
        this(name,1,2,"outlet");
    }

    
    public void sing() {
        System.out.println("GuineaPig is singing...");
    }

    @Override
    public void gnaw() {
    System.out.println("GuineaPig is gnawing tree...");    
    }

    @Override
    public String toString() {
        return super.toString()+"\nkind;\t"+this.kind+"\n\nThis is GuineaPig!"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void speak() {
        
    System.out.println("Pee! Pee! Peeeee!");
    }

    @Override
    public void eat() {
    System.out.println("GuineaPig is eating carrot...");   
    }
    
    
}
