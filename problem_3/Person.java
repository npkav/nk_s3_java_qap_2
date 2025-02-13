// Nickolas Kavanagh - SD12
// Semester 3 - Advanced Programming (Java)
// 2025/02/05 - 2025/02/13

// Problem #3: The CreditCard Class


package problem_3;

public class Person {
    private String firstName;
    private String lastName;
    private Address home;

    public Person(String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

    public String toString() {
        return firstName + " " + lastName + ", " + home.toString();
    }
}
