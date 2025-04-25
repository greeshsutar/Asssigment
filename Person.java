package Assigment;

public class Person {
	String name;
    int age;
    String qualification;
    String address;

    // Constructor
    public Person(String name, int age, String qualification, String address) {
        this.name = name;
        this.age = age;
        this.qualification = qualification;
        this.address = address;
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Qualification: " + qualification);
        System.out.println("Address: " + address);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Creating first object with name Rajesh
        Person person1 = new Person("Rajesh", 45, "BSc", "Mysore");

        // Creating second object
        Person person2 = new Person("Anita", 30, "MBA", "Bangalore");

        // Displaying information
        person1.displayInfo();
        person2.displayInfo();
    }
}
