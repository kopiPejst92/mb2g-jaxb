package domain;

public class User {
    private String firstName;
    private String lastName;
    private String eMail;

    public User(){

    }

    public User(String firstName, String lastName, String eMail){
        this.firstName=firstName;
        this.lastName=lastName;
        this.eMail=eMail;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEMail() {
        return this.eMail;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }



    public String toString() {
        return "User" + this.firstName + ", lastName=" + this.lastName + ", eMail=" + this.eMail + ")";
    }
}

