package org.kellzo.models;

// The User class represents a user of the banking system
public class User extends Model {
    private String username;
    private String password;
    private String socialSecurityNumber;
    private String mobileNumber;

    public User(int id, String created, String username, String socialSecurityNumber, String mobileNumber) {
        super(id, created);
        this.username = username;
        this.socialSecurityNumber = socialSecurityNumber;
        this.mobileNumber = mobileNumber;
    }

    public User() {
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}