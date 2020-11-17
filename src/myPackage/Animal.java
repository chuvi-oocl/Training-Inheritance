package myPackage;

public class Animal {
    protected int age;
    protected int weight;
    protected boolean running;
    protected boolean eating;

    public Animal(int age, int weight, boolean running, boolean eating) {
        this.age = age;
        this.weight = weight;
        this.running = running;
        this.eating = eating;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean getRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean getEating() {
        return eating;
    }

    public void setEating(boolean eating) {
        this.eating = eating;
    }
}
