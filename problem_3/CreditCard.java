// Nickolas Kavanagh - SD12
// Semester 3 - Advanced Programming (Java)
// 2025/02/05 - 2025/02/13

// Problem #3: The CreditCard Class

// Create a CreditCard class according to the UML Diagram on the back.
// It should have data fields that include an owner of type Person, a
// balance of type Money, and a creditLimit of type Money.


package problem_3;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0.0);
    }

    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) <= 0) {
            balance = newBalance;
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
    }
}
