package Groups;

public class Doctor {
String firstName;
String dateOfBurth;
String gender;
String email;
public Patient[] patients = new Patient[0];

    public Doctor() {
    }

    public Doctor(String firstName, String dateOfBurth, String gender, String email) {
        this.firstName = firstName;
        this.dateOfBurth = dateOfBurth;
        this.gender = gender;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDateOfBurth() {
        return dateOfBurth;
    }

    public void setDateOfBurth(String dateOfBurth) {
        this.dateOfBurth = dateOfBurth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "firstName='" + firstName + '\'' +
                ", dateOfBurth='" + dateOfBurth + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
