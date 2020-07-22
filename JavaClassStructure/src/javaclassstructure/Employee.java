package javaclassstructure;

/* Class */
public class Employee {

    /* Variables */
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String homeAddress;
    private String designation;
    private int age;
    private Double salary;

    /* Constructor */
    public Employee(String firstName, String lastName, String mobileNumber, String homeAddress, String designation, int age, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.homeAddress = homeAddress;
        this.designation = designation;
        this.age = age;
        this.salary = salary;
    }

    /* Methods */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
