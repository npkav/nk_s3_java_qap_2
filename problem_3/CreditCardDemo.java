// Nickolas Kavanagh - SD12
// Semester 3 - Advanced Programming (Java)
// 2025/02/05 - 2025/02/13

// Problem #3: The CreditCard Class


package problem_3;

// Demonstrates the CreditCard class
public class CreditCardDemo {
    public static void main(String[] args) {
        // define constants
        final Money LIMIT = new Money(1000);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT = new Money(10.02);
        final Money THIRD_AMOUNT = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);
        
        // create owner and visa card
        Person owner = new Person("Christie", "Diane", 
            new Address("237J Harvey Hall", "Menomonie", "WI", "54751"));
        CreditCard visa = new CreditCard(owner, LIMIT);
        
        // output owner and visa card
        System.out.println(visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getCreditLimit());
        System.out.println();
        
        // attempt to charge first amount
        System.out.println("Attempt to charge " + FIRST_AMOUNT);
        visa.charge(FIRST_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
        
        // attempt to charge second amount
        System.out.println("Attempt to charge " + SECOND_AMOUNT);
        visa.charge(SECOND_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
        
        // attempt to pay third amount
        System.out.println("Attempt to pay " + THIRD_AMOUNT);
        visa.payment(THIRD_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
        
        // attempt to charge fourth amount
        System.out.println("Attempt to charge " + FOURTH_AMOUNT);
        visa.charge(FOURTH_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
    }
}