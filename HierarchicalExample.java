// File Name: HierarchicalExample.java

// Parent Class
class Student {
    String name;
    int roll;
    
    void getStudentDetails(String n, int r) {
        name = n;
        roll = r;
    }
}

// Child Class 1
class Address extends Student {
    String address;
    void getAddress(String addr) {
        address = addr;
    }
    void displayAddress() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Address: " + address);
    }
}

// Child Class 2
class College extends Student {
    String collegeName;
    void getCollege(String cname) {
        collegeName = cname;
    }
    void displayCollege() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("College: " + collegeName);
    }
}

// Main Class
public class HierarchicalExample {
    public static void main(String[] args) {
        Address obj1 = new Address();
        obj1.getStudentDetails("Rajeev Singh", 25);
        obj1.getAddress("Bihar, India");
        System.out.println("=== Address Details ===");
        obj1.displayAddress();

        College obj2 = new College();
        obj2.getStudentDetails("Rajeev Singh", 25);
        obj2.getCollege("ABC College");
        System.out.println("\n=== College Details ===");
        obj2.displayCollege();
    }
}

