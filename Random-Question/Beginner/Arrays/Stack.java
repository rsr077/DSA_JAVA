public class Stack {

    public static void main(String[] args) {
        // 🧱 Stack memory (primitive types and local variables)
        int x = 10;
        int y = 20;
        System.out.println("Stack x + y = " + (x + y));

        // 🌳 Heap memory (objects created with 'new')
        Person person = new Person("RSR");
        System.out.println("Heap name = " + person.name);
    }
}

class Person {
    String name;

    // Constructor
    Person(String name) {
        this.name = name;
    }
}
