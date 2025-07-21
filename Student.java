// File Name: MultipleInterfaceExample.java

// First Interface
interface College {
    void collegeName();
}

// Second Interface
interface Department {
    void departmentName();
}

// Class implements both interfaces
public class Student implements College, Department {

    public void collegeName() {
        System.out.println("College: ABC Engineering College");
    }

    public void departmentName() {
        System.out.println("Department: Computer Science");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.collegeName();
        s.departmentName();
    }
}
