package model;

public class Customer {
    private String nameCustomer ;
    private String dateOfBirth ;
    private String address ;

    public Customer() {
    }

    public Customer(String nameCustomer, String dateOfBirth, String address) {
        this.nameCustomer = nameCustomer;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
