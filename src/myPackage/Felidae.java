package myPackage;

public class Felidae extends Animal{
    public Felidae(int age, int weight, boolean running, boolean eating) {
        super(age, weight, running, eating);
    }
    public void meow() {
        System.out.println("Meow meow");
    }
}
