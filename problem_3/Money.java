// Nickolas Kavanagh - SD12
// Semester 3 - Advanced Programming (Java)
// 2025/02/05 - 2025/02/13

// Problem #3: The CreditCard Class


package problem_3;

public class Money {
    private long dollars;
    private long cents;

    // constructor
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = (long) ((amount - dollars) * 100);
    }

    // copy constructor
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // add function
    public Money add(Money otherAmount) {
        double total = this.dollars + otherAmount.dollars + (this.cents + otherAmount.cents) / 100.0;
        return new Money(total);
    }

    // subtract function
    public Money subtract(Money otherAmount) {
        double total = this.dollars - otherAmount.dollars + (this.cents - otherAmount.cents) / 100.0;
        return new Money(total);
    }

    // compareTo function
    public int compareTo(Money otherObject) {
        double thisAmount = this.dollars + this.cents / 100.0;
        double otherAmount = otherObject.dollars + otherObject.cents / 100.0;
        return Double.compare(thisAmount, otherAmount);
    }

    // equals function
    public boolean equals(Money otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    // toString function
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}
