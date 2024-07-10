package org.example;
public class Main {
    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("John Doe", 30);

        // Print the person object
        System.out.println(person);

        // Update the person's name and age
        person.setName("Jane Doe");
        person.setAge(25);

        // Print the updated person object
        System.out.println(person);
    }
}
