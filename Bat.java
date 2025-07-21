// First interface
interface Animal {
    void eat();
}

// Second interface
interface Bird {
    void fly();
}

// Class implementing both interfaces
public class Bat implements Animal, Bird {
    public void eat() {
        System.out.println("Bat eats insects.");
    }

    public void fly() {
        System.out.println("Bat flies at night.");
    }

    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.eat();
        bat.fly();
    }
}
