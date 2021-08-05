public class User {

    private String firstName;
    private String surName;
    private String eMail;

    public User (String firstName, String surName, String eMail) {
        this.firstName = firstName;
        this.surName = surName;
        this.eMail = eMail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String geteMail() {
        return eMail;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
