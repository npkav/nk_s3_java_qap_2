// Nickolas Kavanagh - SD12
// Semester 3 - Advanced Programming (Java)
// 2025/02/05 - 2025/02/13

// Problem #3: The CreditCard Class

package problem_3;

public class Address {
    private String street;
    private String city;
    private String province;
    private String postalCode;

    public Address(String street, String city, String province, String postalCode) {
        this.street = street;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    public String toString() {
        return street + ", " + city + ", " + province + ", " + postalCode;
    }
}
