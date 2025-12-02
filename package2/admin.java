package package2;

import package1.student;

public class admin extends student {

    public void show() {
        System.out.println("Accessing protected b = " + b); // inherited
        System.out.println("Accessing public c = " + c); // public
    }

    public static void main(String[] args) {

        admin obj = new admin();
        student s = new student();

        s.display(); // public method from student
        obj.show(); // access inherited members
    }
}
