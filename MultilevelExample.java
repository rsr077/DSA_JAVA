// File Name: MultilevelExample.java

// Parent Class
class Student {
    String name;
    void getName(String n) {
        name = n;
    }
}

// First Child Class (Inherits from Student)
class Roll extends Student {
    int roll;
    void getRoll(int r) {
        roll = r;
    }
}

// Second Child Class (Inherits from Roll)
class Address extends Roll {
    String address;
    void getAddress(String addr) {
        address = addr;
    }
    void display() {
        System.out.println("Name = " + name);
        System.out.println("Roll = " + roll);
        System.out.println("Address = " + address);
    }
}

// Main Class
public class MultilevelExample {
    public static void main(String[] args) {
        Address obj = new Address();
        obj.getName("Rajeev Singh Rajput");
        obj.getRoll(24);
        obj.getAddress("Bihar, India");
        obj.display();
    }
}
 
  

